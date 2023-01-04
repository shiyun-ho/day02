package game;

public class Card {
    private String suit;
    private Integer value;
    private String name;

    public Card(String suit, Integer value, String name){
        this.suit = suit;
        this.value = value;
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }
    public Integer getValue() {
        return value;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Card{name= %s, suit =%s, value= %d}"
            .formatted(this.name, this.suit, this.value);
    }

    
}

// package game;

// public class Card {
//     //members
//     public String color;
//     public String suit;
//     public int number;

//     // //constructors with parameters
//     // public Card(String color, String suit, int number) {
//     //     this.color = color;
//     //     this.suit = suit;
//     //     this.number = 1;
//     // }

//     public Card(String red, String red2, int i) {
// 	}

// 	public void setColor(String color) {
//         this.color = color;
//     } 

//     public void setSuit(String suit) {
//         this.suit = suit;
//     }

//     public void setNumber(int number){
//         this.number = number;
//     }

   
// }
