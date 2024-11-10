package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

private List<Card> cards; //list of 52 card objects

public Deck() { //constructor initializes the cards list with 52 unique cards
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
	

	
	public void shuffle() { //randomly shuffle cards list
		Collections.shuffle(cards);
	}
	
	public Card draw() { //remove and return the top card from the cards list
		return cards.remove(0);
	}
	
	
}
