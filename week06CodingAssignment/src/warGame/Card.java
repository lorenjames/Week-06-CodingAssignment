package warGame;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	
	public void describe() {
		System.out.println(this.name + " Value of: " + this.value);
	}

}
