package unit12;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word[] output = new Word[size];
		int i=0;
		while (file.hasNextLine()){
			output[i]=new Word(file.nextLine());
			i++;
			
		}
		Arrays.sort(output);

		for (Word j:output){
			System.out.println(j);
			
		}











	}
}