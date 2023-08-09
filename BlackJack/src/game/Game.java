package game;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import java.util.ArrayList;
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
	
	public void deal() {
		player.getHand(0).addCard(shoe);
		dealer.getHand(0).addCard(shoe);
		player.getHand(0).addCard(shoe);
		dealer.getHand(0).addCard(shoe);
	}

	public int getShoeSize() {
		return shoe.collectionSize();
	}
	
}
