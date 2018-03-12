package unit11_arraylist;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));
		String classname = file.nextLine();
		int num = file.nextInt();
		file.nextLine();
		Class test = new Class(classname, num);
		int i=1;
		
		while (i<=num){
			
			String studname=file.nextLine();
			String studgrades = file.nextLine();
			Student a = new Student(studname, studgrades);
			test.addStudent(i-1, a);
			i++;
			
		}
		System.out.println(test);
		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println("Class Average = "+test.getClassAverage());	













	}		
}