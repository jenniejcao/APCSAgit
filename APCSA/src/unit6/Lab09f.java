package unit6;

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		test.setRemover("I am Sam I am.", 'a');
		System.out.print(test);
		test.setRemover("bbbbbbbbbbbasbabaaababbbbbbeweaweiuhsd", 'a');
		System.out.print(test);
		test.setRemover("i like lemonade and pie",'e');
		System.out.print(test);
		
		
											
	}
}
