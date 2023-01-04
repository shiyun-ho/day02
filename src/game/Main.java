package game;

public class Main{

    public static void main(String[] args){

        Deck deck = new Deck();
        System.out.println(">> before: %$\n", deck);

        deck.shuffle();

        System.out.printf(">> after: %s\n", deck);
    }
}

// package game;

// public class Main {
//     public static void main(String[] args, String diamond, String red){
//         //instantiate a card
//         Card c = new Card(color, suit, 0);
        
//         c.setColor("red");
//         c.setSuit("diamond");
//         c.setNumber(0);
//         //need set up arguments

//         System.out.printf("%s", red)
        
        
//     }
// }
