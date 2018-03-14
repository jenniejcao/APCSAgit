package unit12;
import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;

	}
	public String getWord(){
		return word;
	}
	public boolean equals(Word rhs){
		if (word.length()==rhs.getWord().length()){
			return true;
		}
		return false;
	}

	public int compareTo( Word rhs )
	{
		if (equals(rhs)) {
			return this.getWord().compareTo(rhs.getWord());
			
		}
		else if (word.length() > (rhs.getWord()).length() ){
			return 1;
		}
		else {
			
			return -1;
		}
		
		
		
	}
	

	public String toString()
	{
		return word;
	}
}