package game;

import java.util.ArrayList;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Card;
import cards.Shoe;
import cards.Hand;

public class Game {
	private Shoe shoe;
	private Player player;
	private Player dealer;

	public Game() {
		shoe = new Shoe(6);
		shoe.shuffle();
		player = new Player("Jake", 20);
		dealer = new Player("Dealer");
	}
	
	public Shoe getShoe() {
		return shoe;
	}
	
	public ArrayList<Card> getHand(Hand person) {
		return person.getCollection();
	}

	public int getShoeSize() {
		return shoe.collectionSize();
	}
	
}
