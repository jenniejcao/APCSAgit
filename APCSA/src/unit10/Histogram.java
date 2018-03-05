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
		
			mostFrequent();
			leastFrequent();
			
		


	}

	public char mostFrequent()
	{

		return '#';
	}

	public char leastFrequent()
	{


		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}