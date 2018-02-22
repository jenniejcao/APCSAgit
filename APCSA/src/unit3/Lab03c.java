//lab03c
package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	Scanner keyboard = new Scanner(System.in);
   	System.out.print("Enter a: ");
   	int a= keyboard.nextInt();
   	System.out.print("Enter b: ");
   	int b= keyboard.nextInt();
   	System.out.print("Enter c: ");
   	int c = keyboard.nextInt();
   	
   	Quadratic test = new Quadratic(a,b,c);
   	test.calcRoots();
   	test.print();
		
	}
}
