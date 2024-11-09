package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

private List<Card> cards;

public Deck() {
		cards = new ArrayList<>();
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
							"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (int i = 0; i < numbers.length; i++) {
				cards.add(new Card(i + 2, numbers[i] + " of " + suit));
			}
		}
	}
	

	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	
}
