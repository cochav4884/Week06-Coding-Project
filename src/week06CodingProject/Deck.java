package week06CodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	 private List<Card> cards;

	    // Constructor
	    public Deck() {
	        cards = new ArrayList<>();
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        for (String suit : suits) {
	            for (int i = 2; i <= 14; i++) {
	                String name = (i == 14 ? "Ace" : i) + " of " + suit;
	                cards.add(new Card(i, name));
	            }
	        }
	        shuffle();
	    }

	    // Shuffle the deck
	    public void shuffle() {
	        Collections.shuffle(cards);
	    }

	    // Draw a card from the top of the deck
	    public Card draw() {
	        return cards.remove(cards.size() - 1);
	    }

}
