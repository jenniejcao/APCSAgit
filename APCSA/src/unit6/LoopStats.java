package unit6;

import static java.lang.System.*;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		start=0;
		stop=0;

	}

	public LoopStats(int beg, int end)
	{

		setNums(beg,end);
	}

	public void setNums(int beg, int end)
	{
		start=beg;
		stop=end;

	}

	public int getEvenCount()
	{
		int evenCount=0;
		for (int c =start; c<=stop; c++){
			if (c%2==0){
				evenCount+=1;
			}
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;
		for (int c =start; c<=stop; c++){
			if (c%2==1){
				oddCount+=1;
			}
		}
		return oddCount;
	}

	public int getTotal()
	{
		int total=0;
		for (int c =start; c<=stop; c++){
			total=total+c;
		}


		return total;
	}
	
	public String toString()
	{
		return start + " " + stop+"\ntotal "+getTotal()+"\neven count "+getEvenCount()+"\nodd count "+getOddCount()+"\n\n";
	}
}