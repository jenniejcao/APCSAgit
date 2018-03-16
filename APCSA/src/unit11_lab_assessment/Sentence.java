package unit11_lab_assessment;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Random;
public class Sentence {
	private Word[] wordList;
	private int length;
	public Sentence(int len){
		length=len;
		wordList=new Word[length];
	}
	public Word[] setWordList(){
		Random r = new Random();
		
		for (int i=0; i<length; i++){
			int go = r.nextInt(4);
			if (go==0){
				wordList[i]=new Word("article");
			}
			else if (go==1){
				wordList[i]=new Word("noun");
			}
			else if (go==2){
				wordList[i]=new Word("verb");
			}
			else if (go==3){
				wordList[i]=new Word("adjective");
			}
			
			
		}
		return wordList;
		
		
	}
	public String toString(){
		setWordList();
		String output="";
		for (int i=0; i< wordList.length; i++){
			output+=wordList[i]+ " ";
		}
		return output;
	}
}
