package unit14;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat= new char[3][3];

	}

	public TicTacToe(String game)
	{
		int k=0;
		mat= new char[3][3];
			for (int i=0; i<3; i++){
				for (int j=0; j<3; j++){
					mat[i][j]=game.charAt(k);
					k++;
				}
			}


	}

	public String getWinner()
	{
		String output="";
		for (int i=0; i<3; i++){
			if ((mat[i][0]==mat[i][1])&&(mat[i][1]==mat[i][2])){
				output+=mat[i][1]+" wins horizontally!";
			}
		}
		for (int i=0; i<3; i++){
			if ((mat[0][i]==mat[1][i])&&(mat[1][i]==mat[2][i])){
				output+=mat[1][i]+" wins vertically!";
			}
		}
		if (((mat[0][0]==mat[1][1])&&(mat[1][1]==mat[2][2]))||(mat[2][0]==mat[1][1])&&(mat[1][1]==mat[0][2])){
			
			output+=mat[1][1]+" wins diagonally!";
		}
		
		if (output.equals("")){
			output+=("cat's game - no winner!");
		}


		return output;
	}

	public String toString()
	{
		String output="";
		for (char[] row:mat){
			for (char letter:row){
				output+=letter;
			}
			output+="\n";
		}
		output+=getWinner();



		return output+"\n\n";
	}
}