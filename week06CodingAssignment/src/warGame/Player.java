package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
		
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<>();
	}
	
	public void describe() {
		System.out.println(this.name + "'s hand:");
		System.out.println("------");
		for (Card card : this.hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
	
	
	
}



