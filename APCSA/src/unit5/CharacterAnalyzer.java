package unit5;
import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar='a';

	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
		
	}

	public void setChar(char c)
	{

		theChar=c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{ if (theChar>64 && theChar<91){
		return true;
	}

		return false;
	}

	public boolean isLower( )
	{if (theChar>96 && theChar<123){
		return true;
	}


		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar>47 && theChar<58){
			return true;
		}


		return false;
	}	

	public int getASCII( )
	{
		int ascii = theChar;
		return ascii;
	}

	public String toString()
	{String chartype = "lowercase ";
	if (isUpper()){ chartype="uppercase ";}
	if (isLower()){chartype="lowercase ";}
	if (isNumber()){chartype="number ";}

	
		return ""+getChar() + " is a "+chartype+"character. ASCII == " + getASCII() + "\n";	  
	}
}