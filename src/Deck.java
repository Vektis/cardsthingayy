/**
 * Created by vianrosal on 3/15/17.
 */
import java.util.*;
public class Deck {
    public ArrayList ar15 = new ArrayList();
    public Deck(String ranks[],String suits[],int points[]){
        for (int i = 0; i <= ranks.length; i++) {
            ar15.add(new String[]{ranks[i],suits[i],points[i]});

        }
    }
}
