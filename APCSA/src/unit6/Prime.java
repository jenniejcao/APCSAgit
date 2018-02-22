package unit6;

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{

		number=0;
	}

	public Prime(int num)
	{
		setPrime(num);

	}

	public void setPrime(int num)
	{
		number=num;

	}

	public boolean isPrime()
	{

		for (int c=2; c<=Math.sqrt(number); c++){
			if (number%c==0){
				return false;
			}
		}



		return true;
	}

	public String toString()
	{
		String output="";
		if (isPrime()){
			output=number+" is prime.\n\n";
		}
		else{
			output=number+" is not prime.\n\n";
		}



		return output;
	}
}
