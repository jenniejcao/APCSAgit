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
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	Random r= new Random();
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		loadNouns();
		loadVerbs();
		loadAdjectives();
	
	}

	public MadLib(String fileName)
	{
		//load stuff
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		loadNouns();
		loadVerbs();
		loadAdjectives();
	
		try{
			Scanner file6 = new Scanner(new File(fileName));
	
			while (file6.hasNext()){
				if (file6.next().equals("#")){
					getRandomNoun();
				}
				if (file6.next().equals("@")){
					getRandomVerb();
				}
				if (file6.next().equals("&")){
					getRandomAdjective();
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
			int i =0;
			while (file2.hasNext()){
				nouns.add(i, file2.next());
				i++;
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
			int i =0;
			while (file3.hasNext()){
				verbs.add(i, file3.next());
				i++;
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
			Scanner file4 = new Scanner(new File("adjectives (3).dat"));
			int i =0;
			while (file4.hasNext()){
				nouns.add(i, file4.next());
				i++;
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