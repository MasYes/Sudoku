/**
 * Created with IntelliJ IDEA.
 * User: Юлиан
 * Date: 24.09.13
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 */
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws Exception{
		int[][] matrix = new int[9][9];

		String matrixS =
						"1 2 3 4 5 6 7 8 9" +
						" 7 8 9 1 2 3 4 5 6" +
						" 4 5 6 7 8 9 1 2 3" +
						" 9 1 2 3 4 5 6 7 8" +
						" 6 7 8 9 1 2 3 4 5" +
						" 3 4 5 6 7 8 9 1 2" +
						" 8 9 1 2 3 4 5 6 7" +
						" 5 6 7 8 9 1 2 3 4" +
						" 2 3 4 5 6 7 8 9 1" ;

		int count = 0;
		for(String i : matrixS.split(" ")){
			matrix[count/9][count%9] = Integer.parseInt(i);
			count++;
		}

		boolean ok = true;
		HashSet<Couple> set;
		HashSet<Integer> strings;
		HashSet<Integer> columns;
		for(int i = 1; i < 10; i++){
			strings = new HashSet<>();
			set = new HashSet<>();
			columns = new HashSet<>();
			for(count = 0; count < 9*9; count++){
				if(matrix[count/9][count%9] == i){
					set.add(new Couple((count/9)/3, (count%9)/3));
					strings.add(count/9);
					columns.add(count%9);
				}
			}
			if(set.size() != 9 || strings.size()!= 9 || columns.size() != 9){
				ok = false;
				break;
			}
		}
		if(ok)
			System.out.println("Ok");
		else
			System.out.println("!ok");
	}
}
