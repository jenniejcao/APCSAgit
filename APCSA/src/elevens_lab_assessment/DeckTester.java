package elevens_lab_assessment;
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
		System.out.println("sample deck");
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"red", "green"};
		int[] values = {3,2,1};
		Deck x = new Deck(ranks, suits, values);
		System.out.println("\nsize: "+x.size());
		System.out.println("\ndeal: "+x.deal());
		System.out.println("\nis empty: "+x.isEmpty());
		System.out.println("\n"+x);
		
		System.out.println("\n52 card deck");
		String[] deckranks={"ace","two","three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack",
				"queen", "king"};
		String[] decksuits={"hearts", "spades", "clubs", "diamonds"};
		int[] deckvalues={1,2,3,4,5,6,7,8,9,10,10,10,10};
		Deck cards = new Deck(deckranks, decksuits, deckvalues);
		System.out.println("\n"+cards);
		System.out.println("\nsize: "+cards.size());
		System.out.println("\ndeal: "+cards.deal());
		System.out.println("\ndeal: "+cards.deal());
		System.out.println("\n"+cards);
		
		}
		
	
}
