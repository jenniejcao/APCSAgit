package unit9_elevens;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card x= new Card("king","hearts",13);
		Card y =new Card("seven","diamonds",7);
		Card z =new Card("king","hearts",13);
		
		//card x
		System.out.println(x.suit());
		System.out.println(x.rank());
		System.out.println(x.pointValue());
		System.out.println(x.matches(z));
		System.out.println(x);
		System.out.println();
		//card y
		System.out.println(y.suit());
		System.out.println(y.rank());
		System.out.println(y.pointValue());
		System.out.println(y.matches(z));
		System.out.println(y);
		System.out.println();
		//card z
		System.out.println(z.suit());
		System.out.println(z.rank());
		System.out.println(z.pointValue());
		System.out.println(z.matches(x));
		System.out.println(z);
	}
}