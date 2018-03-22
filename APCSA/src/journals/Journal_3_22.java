package journals;
import java.util.Random; 
public class Journal_3_22 {
	private int[] [] matrix;
	public Journal_3_22(){
		matrix = new int[6][6];
		Random r = new Random();
		for (int i=0; i<6; i++){
			for (int j=0; j<6; j++){
				int go = r.nextInt();
				int k;
				if (go%2==0){
					k=0;
				}
				else {
					k=1;
				}
				matrix[i][j] = k;
			}
		}
	}
	public void parityChecker(){
		int one=0;
		int k=0;
		for (int[] row:matrix){
			for (int spot: row){
				if (spot==1){
					one++;
				}
			}
			if (one%2==0){
				System.out.println("row "+k+" has an even number of 1s.");
			}
			k++;
			one=0;
		}
		one =0;
		int column=0;
		for (int i=0; i<6; i++){
			for (int j=0; j<6; j++){
				if (matrix[j][i]==1){
					one++;
				}
			}
			if (one%2==0){
				System.out.println("column "+column+" has an even number of 1s. ");
			}
			column++;
			one=0;
		}
		
	}
	public String toString(){

		String output="";
		for (int[] row : matrix){
			for (int spot: row){
				output+=spot;
			}
			output+="\n";
		}
		return output;
	}
	public static void main(String args[]){
		Journal_3_22 test = new Journal_3_22();
		System.out.println(test);
		test.parityChecker();
		
	}

}
