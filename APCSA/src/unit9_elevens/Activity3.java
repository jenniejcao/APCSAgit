package unit9_elevens;
import java.util.Random;
public class Activity3 {
	public static String flip(){
		String output="";
		Random r= new Random();
		int j =r.nextInt(3);
		if (j==0 || j==1){
			output="heads";
		}
		else{
			output="tails";
		}
		return output;
	}
	public static boolean arePermutations(int[] array1, int[] array2){
		int counter=0;
		for (int i=0; i<array1.length; i++){
			for (int j=0; j<array2.length; j++){
				if (array1[i]==array2[j]){
					counter++;
				}
			}
		}
		if (counter==array1.length){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args){
		System.out.println(Activity3.flip());
		int[] x = {1,2,3, 4};
		int [] y = {2, 3,1,5};
		System.out.println(Activity3.arePermutations(x,y));
	}

}
