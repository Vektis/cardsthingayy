/**
 * Created by vianrosal on 3/15/17.
 */
import java.util.*;
public class Deck {
    public ArrayList<Card> ar15 = new ArrayList();
    public Deck(String ranks[],String suits[],int points[]){
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                ar15.add(new Card(ranks[j],suits[i],points[j]));
            }
        }
    }
    public boolean isEmpty(){
    return ar15.isEmpty();
    }
    public int size(){
        return ar15.size();
    }
    public Card deal(){
        if(isEmpty()){
            return null;
        }
        Card glock = ar15.get(ar15.size()-1);
        ar15.remove(ar15.size()-1);
        return glock;
    }
    public void addCustom(String rank, String suit, int val){
        Card c = new Card(rank,suit,val);
        ar15.add(c);
    }



}

