package unit7;
import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size=0;
		letter="a";
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}

	public String getLetter()
	{
		String output="";
		
		for (int c=1; c<=size; c++){
			for (int d=0; d<size-c; d++){
				output=output+" ";}
			for (int e=1; e<=c; e++){
				output=output+letter;
			}
		
			
		output=output+"\n";	
		}
	
		return output;
	}

	public String toString()
	{
		
		return getLetter()+"\n";
	}
}
