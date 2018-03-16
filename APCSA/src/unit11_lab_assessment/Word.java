package unit11_lab_assessment;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Random;
public class Word {
	private String word;
	private String type;
	private String[] nouns= {"boy", "girl", "cat", "dog"};
	private String[] verbs = {"yelled", "jumped", "sat", "ran"};
	private String[] articles = {"a", "the"};
	private String[] adjectives = {"happy", "purple", "tall"};
	public Word(String a){
		setWord(a);
	}
	public String getWord(){
		
		return word;
	}
	public void setWord(String a){
		type=a;
		Random r = new Random();
		if (a.equals("noun")){
			word=nouns[r.nextInt(nouns.length)];
			
		}
		else if (a.equals("verb")){
			word=verbs[r.nextInt(verbs.length)];
		}
		else if (a.equals("article")){
			word=articles[r.nextInt(articles.length)];
		}
		else if (a.equals("adjective")){
			word=adjectives[r.nextInt(adjectives.length)];
		}
	}
	public String toString(){
		setWord(type);
		return word;
	}

}
