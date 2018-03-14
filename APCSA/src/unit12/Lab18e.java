package unit12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word2[] output = new Word2[size];
		int i=0;
		while (file.hasNextLine()){
			output[i]=new Word2(file.nextLine());
			i++;
			
		}
		Arrays.sort(output);

		for (Word2 j:output){
			System.out.println(j);
			
		}












	}
}