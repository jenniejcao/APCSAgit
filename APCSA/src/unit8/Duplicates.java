package unit8;
/*
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header: 

public static int[] eliminateDuplicates(int[] list) 

Write a test program that reads in ten integers, invokes the method, and displays the result. Here is the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2 
The distinct numbers are: 1 2 3 6 4 5

 */

public class Duplicates {
	private static int[] numlist;
	private static int[] finallist;
	public static int[] eliminateDuplicates(int[] list){
		numlist=list;
		for (int i=0; i<numlist.length; i++){
			for (int j=0; j<=i; j++){
				if (numlist[i]!=finallist[j]){
					finallist[j]=numlist[i];
				}
			}
		}
		return finallist;
	}


public static void main(String[] args){
	int [] test = {1,2,3,4,5,6,7,8,9,1,2,3};
	Duplicates x = new Duplicates();
	System.out.print(x.eliminateDuplicates(test));
}
}
