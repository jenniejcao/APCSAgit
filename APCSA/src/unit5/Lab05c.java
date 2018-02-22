package unit5;

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05c
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a word: ");
		String w = keyboard.next();
		StringOddOrEven test= new StringOddOrEven();
		test.setString(w);
		test.isEven();
		System.out.print(test);
		
	}
}