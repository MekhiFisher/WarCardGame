package javaCodingProjectFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	Scanner sc = new Scanner(System.in);
	
	Player() {
		System.out.println("Enter your name: ");
		name = sc.next();
		score = 0;
	}
	
	public void describe() {
		System.out.println(name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card flippedCard = hand.remove(0);
		return flippedCard;
	}
	
	public void incrementScore() {
		score += 1;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
}
