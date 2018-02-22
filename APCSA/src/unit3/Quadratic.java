//quadratic
package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	Scanner keyboard=new Scanner(System.in);
	private int a, b, c;
	private double rootOne;
	private double rootTwo;
	
	public Quadratic()
	{
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		setEquation(quadA,quadB,quadC);
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a=quadA;
		b=quadB;
		c=quadC;

 	}


	public void calcRoots( )
	{
		rootOne= (-b+Math.pow(b*b-(4*a*c), 0.5))/(2*a);
		rootTwo= (-b-Math.pow(b*b-(4*a*c), 0.5))/(2*a);

	}

	public void print( )
	{
		System.out.println("");
		System.out.println("Root one:: "+String.format("%.2f", rootOne));
		System.out.println("Root two:: "+String.format("%.2f", rootTwo));

	}
}
