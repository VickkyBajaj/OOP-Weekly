package Week5_6;

import java.util.Random;

class Card {
    private String suit;
    private String faceValue;

    // Possible suits and face values
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] FACE_VALUES = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "Jack", "Queen", "King", "Ace"
    };

    // Constructor to generate a random card
    public Card() {
        Random random = new Random();
        this.suit = SUITS[random.nextInt(SUITS.length)];
        this.faceValue = FACE_VALUES[random.nextInt(FACE_VALUES.length)];
    }

    // toString method to display the card
    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}

public class CardDealer {
    public static void main(String[] args) {
        // Deal five random cards
        System.out.println("Dealing 5 random cards:");
        for (int i = 1; i <= 5; i++) {
            Card card = new Card();
            System.out.println("Card " + i + ": " + card);
        }
    }
}
