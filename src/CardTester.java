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
		String [] lad = new String[]{"a","b","c"};
		String [] wew = new String[]{"giraffes","lions"};
		int wewlad []  = new int[]{1,2,3};
		Deck samuraibuyer = new Deck(lad,wew,wewlad);
		Deck no = new Deck(lad,wew,wewlad);
		Deck yeah = new Deck(lad,wew,wewlad);
		System.out.println(no.size());
		System.out.println(yeah.isEmpty());
		for(Card c: samuraibuyer.ar15){
			System.out.println(c.getRank()+ ":"+c.getSuit()+":"+c.getPointValue());
		}
		String [] ranks = {"ace","king","queen","jack","10","9","8","7","6","5","4","3","2"};
		String [] suits = {"spades","hearts","diamonds","clubs"};
		int [] val = {11,10,10,10,10,9,8,7,6,5,4,3,2};
		Deck d = new Deck(ranks,suits,val);
		System.out.println(d.size());
		for(Card c: d.ar15){
			System.out.println(c.getRank()+ ":"+c.getSuit()+":"+c.getPointValue());
		}
	}
}
