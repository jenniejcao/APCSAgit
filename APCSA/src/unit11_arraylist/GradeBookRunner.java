package unit11_arraylist;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the name of this class? ");
		String classname = keyboard.nextLine();
		System.out.print("How many students are in this class? ");
		int num = keyboard.nextInt();
		keyboard.nextLine();
		Class test = new Class(classname, num);
		int i=1;
		
		while (i<=num){
			
			System.out.print("Enter the name of student "+i+" : ");
			String studname=keyboard.nextLine();
			System.out.println("Enter the grades for "+studname);
			System.out.println("Use the format x - grades (2 - 100 100) : ");
			String studgrades = keyboard.nextLine();
			Student a = new Student(studname, studgrades);
			test.addStudent(i-1, a);
			i++;
			
		}
		System.out.println(test);
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));	
		




















	}		
}