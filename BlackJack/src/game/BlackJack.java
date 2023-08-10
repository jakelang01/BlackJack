package game;

public class BlackJack {

	public static void main(String[] args) {
		Game game = new Game();

		while (game.getShoe().collectionSize() > 15) { // play while there are more than 15 cards left in the shoe
			game.deal();
			
		}
	}

}
