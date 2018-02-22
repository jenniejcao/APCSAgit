package unit4;
import static java.lang.System.*;

public class Lab04b
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		demo.findFirstLastLetters();
		out.println(demo);

		//add more test cases
		
		FirstAndLast demo2 = new FirstAndLast("chicken");
		demo2.findFirstLastLetters();
		System.out.println(demo2);
		
		
		
		
	}
}