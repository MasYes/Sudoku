/**
 * Created with IntelliJ IDEA.
 * User: Юлиан
 * Date: 24.09.13
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
import java.util.HashSet;
import java.util.HashMap;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		System.out.println(isValid("sudoku.txt"));
	}

	private static boolean isValid(String file) throws Exception{
		Scanner scan = new Scanner(new FileInputStream(file));
		HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();
		HashMap<Integer, HashSet<Integer>> columns = new HashMap<>();
		HashMap<Integer, HashSet<Integer>> areas = new HashMap<>();
		int count = 0;
		for(int i = 0; i < 9; i++){
			rows.put(i, new HashSet<Integer>());
			columns.put(i, new HashSet<Integer>());
			areas.put(i, new HashSet<Integer>());
		}
		int i;
		while(scan.hasNextInt()){
			i = scan.nextInt();
			if(!rows.get(count/9).add(i))
				return false;
			if(!columns.get(count % 9).add(i))
				return false;
			if(!areas.get(((count/9)/3)*3 + (count%9)/3).add(i))
				return false;
			count++;
		}
		return true;
	}
}
