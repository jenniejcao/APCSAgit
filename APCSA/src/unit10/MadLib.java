package unit10;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs=new ArrayList<String>();
	private ArrayList<String> nouns=new ArrayList<String>();
	private ArrayList<String> adjectives=new ArrayList<String>();
	Random r= new Random();
	public MadLib()
	{
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
	
	}

	public MadLib(String fileName)
	{
		//load stuff

		loadNouns();
		loadVerbs();
		loadAdjectives();
		
	
		try{
			Scanner file6 = new Scanner(new File(fileName));
			boolean set= true;
			while (set) {
				String mystring=file6.next();
				if (!file6.hasNext()){
					set=false;
				}
				if (mystring.equals("#")){
					System.out.print(getRandomNoun()+" ");
				}
				else if (mystring.equals("@")){
					System.out.print(getRandomVerb()+" ");
				}
				else if (mystring.equals("&")){
					System.out.print(getRandomAdjective()+" ");
				}
				else if (file6.hasNext()){
					System.out.print(mystring+" ");
				}
				
			}
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file2 = new Scanner(new File("nouns.dat"));
			
			while (file2.hasNext()){
				nouns.add(file2.next());
				
			}

		
		}
		catch(Exception e)
		{
			System.out.println("Nouns failed to load.");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file3 = new Scanner(new File("verbs.dat"));
		
			while (file3.hasNext()){
				verbs.add(file3.next());
		
			}

	
	
		}
		catch(Exception e)
		{
			System.out.println("Verbs failed to load.");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file4 = new Scanner(new File("adjectives.dat"));
		
			while (file4.hasNext()){
				adjectives.add(file4.next());
	
			}
	
	
	
		}
		catch(Exception e)
		{
			System.out.println("Adjectives failed to load.");
		}
	}

	public String getRandomVerb()
	{	
		int i=r.nextInt(verbs.size());
	
		return ""+verbs.get(i);
	}
	
	public String getRandomNoun()
	{
		int i=r.nextInt(nouns.size());
		
		return ""+nouns.get(i);
	}
	
	public String getRandomAdjective()
	{
		int i=r.nextInt(adjectives.size());
		
		return ""+adjectives.get(i);
	}
	public String toString()
	{
		
	   return "\n\n\n";
	}
}