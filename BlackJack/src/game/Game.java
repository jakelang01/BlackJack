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

	/**
	 * Creates a new blackjack game with a shuffled shoe, a player, and a dealer
	 */
	public Game() {
		shoe = new Shoe(6);
		shoe.shuffle();
		player = new Player("Jake");
		dealer = new Player("Dealer");
	}

	/**
	 * Deals cards to the player and dealer alternating
	 */
	public void deal() {
		player.getHand().addCard(shoe);
		dealer.getHand().addCard(shoe);
		player.getHand().addCard(shoe);
		dealer.getHand().addCard(shoe);
	}

	/**
	 * Returns the player so methods can be called
	 * 
	 * @param player - the player to call methods
	 * @return - the player
	 */
	public Player getPlayer(Player player) {
		return player;
	}

	/**
	 * Returns the shoe so it can be edited
	 * 
	 * @return - the shoe
	 */
	public Shoe getShoe() {
		return shoe;
	}

	/**
	 * Checks who wins the hand
	 * 
	 * @return - the winner of the hand
	 */
	public Player handWinner() {
		if (player.getHand().handSoftValue() > dealer.getHand().handSoftValue()) {
			return player;
		} else {
			return dealer;
		}
	}

}
