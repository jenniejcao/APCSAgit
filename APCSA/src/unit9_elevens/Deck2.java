package unit9_elevens;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck2 {

	/**
	 * cards contains all the cards in the deck.
	 */
	//private List<Card> cards;
	
	//Unit 9 - Array version of the Deck
	private ArrayList<Card> cards= new ArrayList<Card>();;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck2(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		for (int j=0; j<suits.length; j++){
			for (int i=0; i<ranks.length; i++){
				cards.add(new Card(ranks[i], suits[j], values[i]));

			}
		}
		System.out.println("unshuffled: ");
		for (int i=0; i<cards.size(); i++){
			System.out.println(cards.get(i));
		}

		System.out.println("\nshuffled: ");
		shuffle();
		for (int i=0; i<cards.size(); i++){
			System.out.println(cards.get(i));
		}
		size=cards.size();
	
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size==0){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		int j;
		for (int k=cards.size()-1; k>0; k--){
			Random r= new Random();
			j=r.nextInt(k);
			Card kholder=cards.get(k);
			cards.set(k, cards.get(j));
			cards.set(j, kholder);
			
		}
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (isEmpty()){
			return null;
		}
		size--;
		return cards.get(size);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";


		//Unit 9 - modify to work with Arrays
		
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		

		rtn = rtn + "\n";
		return rtn;
	}
}