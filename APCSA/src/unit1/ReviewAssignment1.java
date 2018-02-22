package unit1;
import java.awt.Rectangle;
import java.util.Random;
import java.util.Scanner;

public class ReviewAssignment1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		/**
		double price = 50.50;
		String description = "a vacuum";
		String message = "Hello";
		System.out.print(message.toUpperCase());
		 **/
	/** Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter a line: ");
	String input= keyboard.nextLine();
	String step1= input.replace("o","1");
	String step2= step1.replace("e", "o");
	String step3= step2.replace("1", "e");
	System.out.print(step3);  **/
	
	Rectangle r = new Rectangle(10,10,6,7);
	System.out.println(r.getHeight());
	System.out.println(r.getWidth());
	Rectangle z = new Rectangle(10,10,10,11);
	System.out.println(z.getHeight());
	System.out.println(z.getWidth());  
		
	//Random r = new Random();
	//System.out.print(r.nextInt(6)+1);
	}

}
