package week06CodingProject;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Each player draws 26 cards from the deck
        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // Each player flips their top card 26 times
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            if (card1 == null || card2 == null) break; // Ensure both cards are not null

            card1.describe();
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins this round!");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins this round!");
            } else {
                System.out.println("This round is a tie!");
            }

            System.out.println("Current score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
        }

        // Print the final score and winner
        System.out.println("Final score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }


}
