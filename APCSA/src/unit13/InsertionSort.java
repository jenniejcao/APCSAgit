package unit13;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
	

	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		list.add(word);
		toString();
	}


	public void remove(String word)
	{
	
		list.remove(word);
		toString();


	}

	public String toString()
	{
		String output="";
		for (String i:list){
			output+=i+" ";
		}
		return output;
	}
}