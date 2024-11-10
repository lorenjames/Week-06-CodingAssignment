package warGame;

public class Card {
	
	private int value; //card value field ie. 2-14
	private String name; //card name field ie. Ace of Diamonds, Two of Hearts
	
	public Card(int value, String name) { //card constructor initializes value and name
		this.value = value;
		this.name = name;
	}

	public String getName() { //name getter
		return name;
	}

	public void setName(String name) { //name setter
		this.name = name;
	}

	public int getValue() { //value getter
		return value;
	}

	
	public void describe() { //describe card
		System.out.println(this.name + " Value of: " + this.value);
	}

}
