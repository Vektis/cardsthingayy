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
		Card misaki = new Card("private","1st class",1945);
		Card arhen = new Card("sergeant","commonwealth",1942);
		Card ceige = new Card("corporal","stalingrad",1943);
		String [] lad = new String[]{"please","help","me"};
		String [] wew = new String[]{"i","d","k"};
		int wewlad []  = new int[]{1,2,3};
		Deck samuraibuyer = new Deck(lad,wew,wewlad);
		Deck no = new Deck(lad,wew,wewlad);
		Deck yeah = new Deck(lad,wew,wewlad);
		System.out.println(no.size());
		System.out.println(yeah.isEmpty());
		System.out.println(samuraibuyer.deal().getRank());
	}
}
