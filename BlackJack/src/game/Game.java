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
	private Hand player;
	private Hand dealer;

	public Game() {
		shoe = new Shoe(6);
		shoe.shuffle();
		player = new Hand();
		dealer = new Hand();
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
