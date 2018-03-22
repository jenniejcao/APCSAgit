package unit14;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{
	

	}

	public Maze(int size, String line)
	{
		Scanner reader = new Scanner(line);
		maze = new int[size][size];
		int i=0;
		for (int k=0; k<size; k++){
			for (int j=0; j<size; j++){
				int next = reader.nextInt();
				maze[k][j]=next;
			}
		}

	}

	public boolean hasExitPath(int r, int c)
	{
		
		if (((r>=0&&r<maze.length)&& (c>=0&&c<maze.length))&&maze[r][c]==1){
			maze[r][c]=9;
			if (c==maze[0].length-1){
				return true;
			}
			else{
				 if(hasExitPath(r+1, c)) {return true; }
				 if (hasExitPath(r-1, c)) {return true;} 
				 if (hasExitPath(r, c+1)) {return true;}
				 if (hasExitPath(r, c-1)){return true;}
				
			}
		}

		return false;
	}

	public String toString()
	{
		String output="";
		for (int[] row: maze){
			for (int spot :row){
				output+=spot;
			}
			output+="\n";
		}
		if (hasExitPath(0,0)){
			output+="exit found";
		}
		else{
			output+="exit not found";
		}





		return output+"\n\n";
	}
}