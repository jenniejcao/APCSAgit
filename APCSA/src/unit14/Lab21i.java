package unit14;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("Lab21i.dat"));
		int size = file.nextInt();
		file.nextLine();
		for (int i=0; i<size; i++){
			String go =file.nextLine();
			Maze test = new Maze(go.length(),go);
			System.out.println(test);
		}
		



	}
}