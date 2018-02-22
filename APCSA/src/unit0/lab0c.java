package unit0;
import java.util.Scanner;

public class lab0c {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    System.out.print("Enter an integer:");
	    int intOne=keyboard.nextInt();
	    System.out.print("Enter an integer:");
	    int intTwo=keyboard.nextInt();
	    System.out.println("\nInteger one: "+intOne);
	    System.out.println("Integer two: "+intTwo);
	    
	    System.out.print("\nEnter a double:");
	    double doubleOne=keyboard.nextDouble();
	    System.out.print("Enter a double:");
	    double doubleTwo=keyboard.nextDouble();
	    System.out.println("\nDouble one: "+doubleOne);
	    System.out.println("Double two: "+doubleTwo);
	    
	    System.out.print("\nEnter a float: ");
	    float floatOne=keyboard.nextFloat();
	    System.out.print("Enter a float: ");
	    float floatTwo=keyboard.nextFloat();
	    System.out.println("\nFloat one: "+floatOne);
	    System.out.println("Float two: "+floatTwo);
	    
	    System.out.print("\nEnter a short: ");
	    short shortOne=keyboard.nextShort();
	    System.out.print("Enter a short: ");
	    short shortTwo=keyboard.nextShort();
	    System.out.println("\nShort one: "+shortOne);
	    System.out.println("Short two: "+shortTwo);
	    
	    keyboard.close();

	}

}
