package game;

import java.security.SecureRandom;
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

    public void shuffle(){
        //logic: Systematic way of shuffling
        //algorithm: Way to shuffle randomly
        //generate random number
        Random rand = new SecureRandom();

        for (int curr =0; curr < deck.size(); i++){
            int toSwap = rand.nextInt(deck.size());
            //gets current card- note that in list there are two types of add(int, element) [NA cos append] OR set)
            Card c = deck.get(curr);
            //to swap
            Card d = deck.get(toSwap);
            deck.set(curr, d);
            deck.set(toSwap, c);

        }
    }

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }

    

    }
    
    //create deck


