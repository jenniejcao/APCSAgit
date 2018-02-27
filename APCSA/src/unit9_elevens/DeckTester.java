package unit9_elevens;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"red", "green"};
		int[] values = {3,2,1};
		Deck x = new Deck(ranks, suits, values);
		System.out.println(x.size());
		System.out.println(x.deal());
		System.out.println(x.isEmpty());
		System.out.println(x);
		
		
		String[] ranks2 = {"high", "medium", "low"};
		String[] suits2= {"apple", "orange", "banana"	};
		int[] values2 = {5,10,15};
		Deck y = new Deck(ranks2, suits2, values2);
		System.out.println(y.size());
		System.out.println(y.deal());
		System.out.println(y.isEmpty());
		System.out.println(y);
		
		String[] ranks3 = {"j", "k" ,"l"};
		String[] suits3= {"circle", "triangle"	};
		int[] values3 = {1,2,3};
		Deck z = new Deck(ranks3, suits3, values3);
		System.out.println(z.size());
		System.out.println(z.deal());
		System.out.println(z.isEmpty());
		System.out.println(z);
		
	}
}
