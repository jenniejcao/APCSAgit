package unit6;

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats();
		test.setNums(1, 5);
		System.out.print(test);
		
		
		LoopStats test2 = new LoopStats();
		test2.setNums(2,8);
		System.out.print(test2);
		
		
		LoopStats test3 = new LoopStats();
		test3.setNums(5,15);
		System.out.print(test3);
					
	}
}