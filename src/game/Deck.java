package game;

import java.util.LinkedList;
import java.util.List;

public class Deck {
   

    //list to hold my deck
    private List<Card> deck;

    public Deck() {
        this.deck = new LinkedList<>();
        for (int i = 0; i< Constants.SUIT.length; i++){
            String suit = Constants.SUIT[i];
            for (int j=0; j < Constants.VALUES.length; j++){
                Integer value = Constants.VALUES[j];
                String name = Constants.NAMES[j];
                Card card = new Card(suit, value, name);
                deck.add(card);
            }
        }
        System.out.println("The new deck");
        System.out.println(deck);

    }
    
    //create deck

}
