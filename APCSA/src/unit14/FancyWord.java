package unit14;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{

	}

   public FancyWord(String s)
	{
	   for (int i=0; i<s.length(); i++){
		   mat[0][i]=s.charAt(i);
	   }




	}

	public String toString()
	{
		String output="";





		return output+"\n\n";
	}
}