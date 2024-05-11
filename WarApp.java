package javaCodingProjectFinal;

public class WarApp {

	public static void main(String[] args) {
		Deck deck1 = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		deck1.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck1);
			} else {
				player2.draw(deck1);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.println("---------------------------------");
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
			System.out.println(p1Card.getName() + "-----" + p2Card.getName());
			if (p1Card.getValue() > p2Card.getValue()) {
				player1.incrementScore();
				System.out.println(player1.name + " wins this round");
			} else if (p1Card.getValue() < p2Card.getValue()) {
				player2.incrementScore();
				System.out.println(player2.name + " wins this round");
			} else {
				System.out.println("Draw");
			}
		}
		System.out.println("---------------------------------");
		if (player1.score > player2.score) {
			System.out.println(player1.name + " wins with a score of: " + player1.score);
			System.out.println(player2.name + " had a score of: " + player2.score);
		} else if (player1.score < player2.score) {
			System.out.println(player2.name + " wins with a score of: " + player2.score);
			System.out.println(player1.name + " had a score of: " + player1.score);
		} else {
			System.out.println("It was a Draw!");
			System.out.println(player1.name + "'s Score: " + player1.score);
			System.out.println(player2.name + "'s Score: " + player2.score);
		}
				
			
			
		
		
		
	}

}
