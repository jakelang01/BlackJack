package players;

import java.util.ArrayList;

import cards.Hand;
import cards.Shoe;

/**
 * 
 * @author Jake Langenfeld
 *
 */

public class Player {

	private String name;
	private ArrayList<Hand> hands;
	private int bankroll;
	private boolean isTurn = false;
	/**
	 * Keeps track of the current hand being played (if split and have multiple
	 * hands)
	 */
	private int playHand = 0;

	/**
	 * Creates a new Player object
	 * 
	 * @param name - the name of the player
	 */
	public Player(String name) {
		hands = new ArrayList<Hand>();
		hands.add(new Hand());
		this.name = name;
	}

	/**
	 * Sets the players turn to false if true and vice-versa
	 */
	public void changeTurn() {
		if (isTurn) {
			isTurn = false;
		} else {
			isTurn = true;
		}
	}

	/**
	 * Add to the players bankroll
	 * 
	 * @param money - amount to add to bankroll
	 */
	public void addBankroll(int money) {
		bankroll += money;
	}

	public int getBankroll() {
		return bankroll;
	}

	public boolean bankrupt() {
		if (bankroll == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Make it the players turn
	 */
	public void setTurnTrue() {
		isTurn = true;
	}

	/**
	 * Return the hand at a certain index in the hand list
	 * 
	 * @param hand - index of the hand
	 * @return - the hand at the index location
	 */
	public Hand getHand(int hand) {
		return hands.get(hand);
	}

	public String getName() {
		return name;
	}

	/**
	 * Place a bet for this hand
	 * 
	 * @param bet - amount of money for this hand
	 */
	public void placeBet(int bet) {
		if (isTurn && getHand(playHand).getHandSize() == 0) {
			hands.get(playHand).setBet(bet);
		}
	}

	/**
	 * Hitting adds a card to the hand from the shoe and removes that card from the
	 * shoe
	 * 
	 * @param shoe - the shoe that is being drawn from
	 */
	public void hit(Shoe shoe) {
		if (isTurn) {
			hands.get(playHand).addCard(shoe);
			shoe.removeCard();
		}
	}

	/**
	 * Staying can end the players turn or move to their next hand if they split
	 * their cards
	 */
	public void stay() {
		if (isTurn && hands.size() > 1) {
			playHand++; // move to next player
		} else if (isTurn) {
			changeTurn();
		}
	}

	/**
	 * Doubling down adds one card to the hand and doubles the bet and ends the
	 * players turn
	 * 
	 * @param shoe - the shoe that is being drawn from
	 */
	public void doubleDown(Shoe shoe) {
		if (isTurn) {
			hands.get(playHand).addCard(shoe);
			hands.get(playHand).setBet(hands.get(playHand).getBet() * 2);
			hands.get(playHand).removeCard();
			stay();
		}
	}

	/**
	 * Splitting can only occur if the 2 dealt cards are the same value then they
	 * will be moved to 2 different hands and played separately. The bet is repeated
	 * for the additional hand.
	 * 
	 * @param shoe - the shoe that is being drawn from
	 */
	public void split(Shoe shoe) {
		if (isTurn) {
			if (hands.get(playHand).getCollection().get(0).getSoftValue() != hands.get(playHand).getCollection().get(1)
					.getSoftValue()) { // compare values of both cards in hand
				return; // not able to split since not same rank
			} else {
				hands.add(new Hand()); // add new hand to Hand list
				hands.get(++playHand).addCard(hands.get(playHand).select()); // move card from first hand to second hand
				hands.get(playHand).removeCard(); // remove card from first hand
				hands.get(++playHand).setBet(hands.get(playHand).getBet()); // set the bet for second hand to same as
																			// first hand
				hands.get(playHand).addCard(shoe); // draw card from shoe and add to the play hand
				shoe.removeCard(); // remove card from shoe
			}
		}
	}

	/**
	 * Displays the players name and the hands they control
	 */
	public void displayPlayer() {
		System.out.println(getName());
		for (int i = 0; i < hands.size(); i++) {
			System.out.println(hands.get(i));
		}
	}
}
