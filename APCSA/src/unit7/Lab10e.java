package unit7;

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do{
			System.out.print("Guessing game - how many numbers? ");
			int range = keyboard.nextInt();
			GuessingGame test=new GuessingGame(range);
			test.playGame();
			System.out.println("\nDo you want to play again? ");
			response=keyboard.next().charAt(0); 
			}while (response =='y');
	}

	}
