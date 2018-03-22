package unit12;

public class Word2 implements Comparable <Word2>{

	private String word;

	public Word2( String s)
	{
		word=s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		char[] wordList=word.toCharArray();
		for (char i:wordList){
			if (vowels.indexOf(i)!=-1){
				vowelCount++;
			}
		}
		

		return vowelCount;
		
		
	}

	public int compareTo(Word2 rhs)
	{
		if (this.numVowels()==rhs.numVowels()){
			return this.word.compareTo(rhs.word);
		}
		else if (this.numVowels()>rhs.numVowels()){
			return 1;
		}
		
	
		return -1;
	}

	public String toString()
	{
		return word;
	}

}
