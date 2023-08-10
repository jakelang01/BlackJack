package game;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Shoe;
import players.Player;

public class Game {
	private Shoe shoe;
	private Player player;
	private Player dealer;

	public Game() {
		shoe = new Shoe(6);
		shoe.shuffle();
		player = new Player("Jake");
		dealer = new Player("Dealer");
	}

	public void deal() {
		player.getHand().addCard(shoe);
		dealer.getHand().addCard(shoe);
		player.getHand().addCard(shoe);
		dealer.getHand().addCard(shoe);
	}
	
	public Player getPlayer(Player player) {
		return player;
	}
	
	public Shoe getShoe() {
		return shoe;
	}
	
	public Player handWinner() {
		if (player.getHand().handSoftValue() > dealer.getHand().handSoftValue()) {
			return player;
		} else {
			return dealer;
		}
	}

}
