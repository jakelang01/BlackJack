package game;

import cards.Card;
import cards.Shoe;

public class Game {
	private Shoe shoe;
	private Player one;
	private Player dealer;

	public Game() {
		shoe = new Shoe(6);
		one = new Player("Jake");
		dealer = new Player("Dealer");
	}

	public Card[] getHand() {
		return null;
	}

	public Card hit() {
		return null;
	}

	public void stay() {

	}

	public Card doubleDown() {
		return null;
	}

	public Card split() {
		return null;
	}

	public Card drawCard() {
		return null;

	}
}
