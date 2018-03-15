package unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.lang.Math;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int i=0;
		while (number>Math.pow(10, i)){
			i++;
		}
	
		
		return i;
	}
	
	public static int[] getSortedDigitArray(int number)
	{

		int[] sorted = new int[getNumDigits(number)];
		int value = number;
		int i=0;
		while (value>0){
		
			sorted[i]=value%10;
			value=(value-(value%10))/10;
			i++;
		}
		Arrays.sort(sorted);


		return sorted;
	}
}