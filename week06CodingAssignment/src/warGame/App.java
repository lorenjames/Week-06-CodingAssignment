package warGame;

public class App {
	
	public static void main(String[] args) {
		
		Deck deck = new Deck(); //initiate a new deck 
		deck.shuffle(); //shuffle the deck
		
		Player player1 = new Player("Loki"); //initiate player 1
		Player player2 = new Player("Oliver"); //initiate player 2
		
		//distributes cards to the players hand by calling draw on each player in a loop 52 times
		for (int i = 0; i < 52; i++) { 
			if (i % 2 ==0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		System.out.println("------------------------------------");
		System.out.println("    Let the game of WAR begin!!!");
		System.out.println("------------------------------------");
		System.out.println();
		
		//extra code to pause game to make game play more realistic
		try { 
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//print welcome to both players
		System.out.println("Welcome " + player1.getName() + " & " + player2.getName() + "!! Are you ready??");
		
		//extra code to pause game to make game play more realistic
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		//prints out each players hand
		player1.describe();
		System.out.println();
		player2.describe();
		System.out.println();
		
		//extra code to pause game to make game play more realistic
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//play is for 26 rounds
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			int round = 1;
			round += i;
			
			System.out.println("--------");
			System.out.println("Round " + round);
			System.out.println("--------");
			//each player flips a card and values are compared
			System.out.print(player1.getName() + ": ");
			card1.describe();
			
			System.out.print(player2.getName() + ": ");
			card2.describe();
			
			System.out.println();
			System.out.println("------------------------------------");
			
			//a point is awarded to the player with the higher value card or no points if equal
			if (card1.getValue() > card2.getValue()) {
				System.out.println(player1.getName() + " WINS the round!!!");
				player1.incrementScore();
			} else if (card2.getValue() > card1.getValue()) {
				System.out.println(player2.getName() + " WINS the round!!!");
				player2.incrementScore();
			} else {
				System.out.println("TIED!! No points for either player.");
			}
			
			
			//prints a rolling score for each player
			System.out.println("Rolling Score: " + player1.getName() + ": " + player1.getScore() + " | " + player2.getName() + ": " + player2.getScore());
			System.out.println("------------------------------------");
			System.out.println();
			
			//extra code to pause game to make game play more realistic
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("***************");
		System.out.println("***GAME OVER***");
		System.out.println("***************");
		System.out.println();
		
		//extra code to pause game to make game play more realistic
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//prints final scores
		System.out.println("Final Scores: ");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		

		
		System.out.println();
		
		//extra code to pause game to make game play more realistic
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//compares player scores and determines a winner or declares a draw
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " WINS THE GAME!!!!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " WINS THE GAME!!!!");
		} else {
			System.out.println("No winners :-( The game is a draw.");
		}
		

		
		
	


	}
	
	

}


