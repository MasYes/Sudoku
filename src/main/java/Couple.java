/**
 * Created with IntelliJ IDEA.
 * User: Юлиан
 * Date: 24.09.13
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */



public class Couple {
	int i;
	int j;
	Couple(int i1, int j1) throws Exception{
		if(i > 9 || i < 0 || j > 9 || i < 0){
			throw new Exception();
		}
		i = i1;
		j = j1;
	}

	public boolean equals(Couple second){
		if(this.i == second.i && this.j == second.j){
			return true;
		}
		return false;
	}
}
