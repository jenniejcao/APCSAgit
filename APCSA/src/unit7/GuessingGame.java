package unit7;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	public GuessingGame(int stop)
	{
		upperBound=stop;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int answer = (int) Math.ceil((Math.random()*upperBound));
		int guess=0;
		int number=0;
		do{
			System.out.println("Enter a number between 1 and "+upperBound);
			guess = keyboard.nextInt();
			if (guess>=1 && guess<=upperBound){
				number+=1;}
			else{
				System.out.println("Number out of range!");
			}
		}while(guess!=answer);
		System.out.println("It took "+number+" guesses to guess "+answer+".");
		System.out.println("You guessed wrong "+((double) (number-1)/upperBound*100)+" percent of the time");




	}

	public String toString()
	{
		String output="";
		return output;
	}
}
