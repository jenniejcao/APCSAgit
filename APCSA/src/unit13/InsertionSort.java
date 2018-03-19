package unit13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;
import java.lang.Math;

class InsertionSort
{
	private ArrayList<String> list = new ArrayList<String>();

	public InsertionSort()
	{
	

	}

	//modfiers
	public void add( String  word)
	{
		
		int loc = 0;
		if (list.indexOf(word)!=-1){
			System.out.println("Already in list.");
		}
		else{
			loc = Collections.binarySearch(list, word);
			
			loc = Math.abs(loc+1);
			list.add(loc, word);
			
		}
	}


	public void remove(String word)
	{
	
		list.remove(word);
		

	}

	public String toString()
	{
		
		String output="";
		for (int i=0; i<list.size(); i++){
			output=output+list.get(i)+" ";
		}
		return output; 
	}
}