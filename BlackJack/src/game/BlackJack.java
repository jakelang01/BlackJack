package game;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Game game = new Game();
		Scanner scan = new Scanner(System.in);

		while (game.getShoe().collectionSize() > 15) { // play while there are more than 15 cards left in the shoe
			game.deal();
			
		}
	}

}
