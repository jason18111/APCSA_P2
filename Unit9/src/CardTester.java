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
		
		Card myCard1 = new Card("Ace", "spades", 10);
		System.out.println(myCard1);
		System.out.println(myCard1.matches(myCard1));
		
		Card myCard2 = new Card("King", "hearts", 10);
		System.out.println(myCard2);
		System.out.println(myCard2.matches(myCard1));
		
		Card myCard3 = new Card("Ace", "spades", 10);
		System.out.println(myCard3);
		System.out.println(myCard3.matches(myCard1));
	}
}
