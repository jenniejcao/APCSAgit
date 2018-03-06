package unit10;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;
	private ArrayList<Character> file;

	public Histogram()
	{



	}

	public Histogram(char[] values, String fName)
	{
		fileName=fName;
		letters = new ArrayList<Character>(values.length);
		for (int i=0; i<values.length; i++){
			letters.add(values[i]);
		}
		





		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
			Scanner fileopen = new Scanner(new File(fileName));
			String filestring="";
			String next;
			boolean set=true;
			while (set){
				next=fileopen.next();
				filestring=filestring+next;
				if (!fileopen.hasNext()){
					set=false;
				}
			}
			file = new ArrayList<Character>(filestring.length());
			for (int i =0; i<filestring.length(); i++){
				file.add(filestring.charAt(i));
			}
		
		count = new ArrayList<Integer>(letters.size());
		for (int i=0; i<letters.size(); i++){
			int counter=0;
			for (int j=0; j<file.size();j++){
				if (file.get(j)==letters.get(i)){
					counter++;
				}
			}
			count.add(counter);
		}
			mostFrequent();
			leastFrequent();
			
		


	}

	public char mostFrequent()
	{
		int holder=count.get(0);
		for (int i=1; i<count.size(); i++){
			if (holder<count.get(i)){
				holder=count.get(i);
			}
		}
		char output = letters.get(count.indexOf(holder));
	
		return output;
	}

	public char leastFrequent()
	{
		int holder=count.get(0);
		for (int i=1; i<count.size(); i++){
			if (holder>count.get(i)){
				holder=count.get(i);
			}
		}
	char output = letters.get(count.indexOf(holder));

	return output;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}