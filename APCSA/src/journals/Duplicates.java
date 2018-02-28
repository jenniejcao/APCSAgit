package journals;
import java.util.Scanner;
/*
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header: 

public static int[] eliminateDuplicates(int[] list) 

Write a test program that reads in ten integers, invokes the method, and displays the result. Here is the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2 
The distinct numbers are: 1 2 3 6 4 5

 */

public class Duplicates {
	public static int[] eliminateDuplicates(int[] list) {
		String savelist="";
		String newlist="";
		int actuallen=0;
		for (int i=0; i<list.length; i++){
			savelist+=list[i];
		}
		
		for (int i=0; i<savelist.length(); i++){
			if (newlist.indexOf(savelist.charAt(i))==-1){
				actuallen++;
				newlist+=savelist.charAt(i)+" ";
			}
		}
		
		
		Scanner chopper =new Scanner(newlist);
		int[] clean = new int[actuallen];
		int i =0;
		while (chopper.hasNextInt()){
			clean[i]=chopper.nextInt();
			i++;
		}
		return clean;
	}
		
	
	
	


public static void main(String[] args){
	int [] test = {1,2,3,4,5,6,7,8,9,1,2,3};
	int [] result = Duplicates.eliminateDuplicates(test);
	for (int i=0; i<result.length; i++){
		System.out.print(result[i]);
	}
	
}
}