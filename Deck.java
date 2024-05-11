package javaCodingProjectFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> deck = new ArrayList<Card>();
	String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
	
	Deck() {
		int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		for (String suit : suits) {
			
			for (Integer numberName : numbers) {
				Card card = new Card(suit, numberName);
				deck.add(card);
				
				
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card draw() {
		return deck.remove(0);
	}
	
	public void describe() {
		for (Card card : deck) {
			card.describe();
		}
	}
}
