package unit11_lab_assessment;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.Random;
public class Paragraph {
	private Sentence[] sentList;
	private int num;
	public Paragraph(int size){
		num=size;
		sentList = new Sentence[num];
		setSentList(num);
	}
	public Sentence[] setSentList(int a){
		Random r= new Random();
		for (int i=0; i<a; i++){
			sentList[i]= new Sentence(r.nextInt(8)+1);
		}
		return sentList;
	}
	public String toString(){
		setSentList(num);
		String output="";
		for (int i=0; i<num; i++){
			output+=sentList[i]+".\n";
		}
		return output;
	}

}
