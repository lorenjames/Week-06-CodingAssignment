package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
		
	private List<Card> hand; //list to store the players cards
	private int score; //score variable to track the players score
	private String name; //name variable to store the player's name
	
	public Player(String name) { //player constructor initializes name and sets the score variable to 0
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<>();
	}
	
	public void describe() { //describe method prints out the player's info and describes each card in their hand
		System.out.println(this.name + "'s hand:");
		System.out.println("------");
		for (Card card : this.hand) {
			card.describe();
		}
	}
	
	public Card flip() { //removes and returns the top card from the player's hand
		return hand.remove(0);
	}
	
	public void draw(Deck deck) { //draws a card from deck and adds to the players hand
		hand.add(deck.draw());
	}
	
	public void incrementScore() { //increases the players score by 1
		score++;
	}
	
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
	
	
	
}



