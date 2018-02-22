//lab03d
package unit3;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter x1: ");
		int x1= keyboard.nextInt();
		System.out.print("Enter y1: ");
		int y1= keyboard.nextInt();
		System.out.print("Enter x2: ");
		int x2= keyboard.nextInt();
		System.out.print("Enter y2: ");
		int y2= keyboard.nextInt();
		
		Distance test = new Distance(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		
		
		
			
	}
}