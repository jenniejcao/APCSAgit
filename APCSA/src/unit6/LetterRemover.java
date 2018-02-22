package unit6;

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence="";
		lookFor='a';
		//call set
	}

	//add in second constructor
	public LetterRemover(String s, char rem){
		setRemover(s,rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		
		int loc = sentence.indexOf(lookFor);
		while (loc!=-1){
			sentence = sentence.substring(0, loc)+sentence.substring(loc+1);
			loc = sentence.indexOf(lookFor);
		}
		String cleaned=sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor+"\n"+removeLetters()+"\n\n";
	}
}