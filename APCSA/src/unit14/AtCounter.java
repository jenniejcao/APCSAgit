package unit14;

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;

	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]		{{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
	}

	public int countAts(int r, int c)
	{

		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		
		if (((r>=0&&r<=10))&&(c<=10&&c>=0)&&atMat[r][c]=='@'){
			atMat[r][c]='-';
			atCount++;
			if ( r<10&&atMat[r+1][c]=='@'){
				System.out.println("go1");
				return countAts(r,c);
			}
			if (r>0&&atMat[r-1][c]=='@'){
				System.out.println("go2");
				return countAts(r,c);
			}
			if (c<10&&atMat[r][c+1]=='@'){
				System.out.println("go3");
				return countAts(r,c);
			}
			if (c>0&&atMat[r][c-1]=='@'){
				System.out.println("go4");
				return countAts(r,c);
			}
		}
		
		return atCount;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		return output;
	}
}