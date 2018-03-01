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
		String ranks[] = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
		String suits[] = {"spades", "hearts", "clubs", "diamonds"};
		int values[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		Deck myDeck = new Deck(ranks, suits, values);
		myDeck.shuffle();
		System.out.println(myDeck);
		myDeck.deal();
		System.out.println(myDeck);
	}
}
