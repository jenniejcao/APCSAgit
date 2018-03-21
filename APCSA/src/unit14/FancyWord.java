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
	   mat=new char[s.length()][s.length()];
	   for (int i=0; i<s.length(); i++){
		   for (int j=0; j<s.length(); j++){
			   mat[i][j]=' ';
		   }
	   }
	   mat = new char[s.length()][s.length()];
	   for (int i=0; i<s.length(); i++){
		   mat[0][i]=s.charAt(i);
		   mat[s.length()-1][i]=s.charAt(i);
	   }
	   for (int i=1; i<s.length()-1; i++){
		  
			   mat[i][i]=s.charAt(i);
			   mat[i][s.length()-i-1]=s.charAt(s.length()-i-1);
		   
	   }
	




	}

	public String toString()
	{
		String output="";
		for (char[] row:mat){
			for (char letter:row){
				output+=letter;
			}
			output+="\n";
		}





		return output+"\n\n";
	}
}