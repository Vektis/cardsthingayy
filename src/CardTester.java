/**
 * This is a class that tests the Card class.
 */
import java.util.*;
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Deck dd = deal();
		for(Card c:  dd.ar15){
			System.out.println(c.getRank()+ ":"+c.getSuit()+":"+c.getPointValue());

		}
	}
	public static Deck deal(){
		Deck ret;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> thing = new ArrayList();
		System.out.println("what suits(say stop when done): ");
		while(true){
			System.out.println("enter suit: ");
			String sss = sc.nextLine();
			if(sss.equals("stop")){
				break;
			}
			thing.add(sss);
		}
		System.out.println("What ranks?(say stop when done listing)");
		String s="";
		ArrayList<String> list = new ArrayList();
		ArrayList<Integer> vallist = new ArrayList();
		while(true){
			System.out.println("enter rank: ");
			s = sc.next();
			if(s.equals("stop")){
				break;
			}
			list.add(s);
			System.out.println("enter that rank's value: ");
			int i = sc.nextInt();
			vallist.add(i);
		}
		int count = 0;
		String[] list2 = new String[list.size()];
		for(String ss:list){
			if(count == vallist.size()-1 ){
				//break;
			}
			list2[count] = ss;
			count++;
		}
		count = 0;
		int[] list3 = new int[list.size()];
		for(int ss:vallist){
			if(count == vallist.size()-1 ){
				//break;
			}
			list3[count] = ss;
			count++;
		}
		count = 0;
		String [] list1 = new String[thing.size()];
		for(String w: thing){
			list1[count] = w;
			count++;
		}


		ret = new Deck(list1,list2,list3);
		System.out.println("Custom cards?(y/n): ");
		String a = sc.next();
		if(a.equals("y")){
			while(true){
				System.out.println("custom card");
				int i;
				String s1,s2;
				System.out.println("rank: ");
				s1 = sc.next();
				System.out.println("suit: ");
				s2 = sc.next();
				System.out.println("value(integer): ");
				i = sc.nextInt();
				ret.addCustom(s1,s2,i);
				System.out.println("continue(y/n): ");
				String t = sc.next();
				if(t.equals("n")){
					break;
				}

			}
		}
		return ret;


	}
}
