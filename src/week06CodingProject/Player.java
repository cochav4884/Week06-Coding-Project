package week06CodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand;
    private int score;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Describe method
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
        System.out.println("Score: " + score);
    }

    // Draw a card from the deck and add it to hand
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    // Flip the top card from the hand
    public Card flip() {
        if (hand.isEmpty()) return null;
        return hand.remove(hand.size() - 1);
    }

    // Increment the score by 1
    public void incrementScore() {
        score++;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

}
