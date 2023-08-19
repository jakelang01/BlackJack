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
	private double bankroll;
	private boolean isTurn = true;
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
	 * Returns the numbers of hands the player has
	 * 
	 * @return - the number of hands the player owns
	 */
	public int numberOfHands() {
		return hands.size();
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
	
	public boolean isTurn() {
		return isTurn;
	}

	/**
	 * Add money to the players bankroll
	 * 
	 * @param money - amount to add to bankroll
	 */
	public void addBankroll(int money) {
		bankroll += money;
	}

	/**
	 * Returns the players bankroll
	 * 
	 * @return - their bankroll
	 */
	public double getBankroll() {
		return bankroll;
	}

	/**
	 * Checks if the players bankroll is 0
	 * 
	 * @return - true if bankroll equals 0 otherwise false
	 */
	public boolean bankrupt() {
		if (bankroll == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Return the current play hand
	 * 
	 * @return - the current play hand
	 */
	public Hand getHand() {
		return hands.get(playHand);
	}
	
	public void printAllHands() {
		for(int i = 0; i < numberOfHands(); i++) {
			hands.get(i).printCollection();
		}
	}

	/**
	 * Returns the players name
	 * 
	 * @return - the players name
	 */
	public String getName() {
		return name;
	}

	public void surrender() { // move to game class i think
		if(isTurn) { // if dealer has ace or ten
			bankroll -= getHand().getBet() / 2;
			while(getHand().getHandSize() > 0) {
				getHand().removeCard();
			}
		}
	}
	
	public void insurance() { // move to game class i think
		if(isTurn) { // if dealer has ace
			
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
			hands.get(playHand).addCard(shoe); // adds the first card from the shoe
		}
	}

	/**
	 * Staying can end the players turn or move to their next hand if they split
	 * their cards
	 */
	public void stay() {
		if (isTurn && !getHand().equals(hands.get(hands.size() - 1))) { // if its the players turn and this isn't their
																		// last hand
			playHand++; // move to the next hand
		} else if (isTurn) {
			changeTurn(); // otherwise end the players turn
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
			hands.get(playHand).addCard(shoe); // add one card to the players hand
			hands.get(playHand).setBet(hands.get(playHand).getBet() * 2); // double the bet
			stay(); // end the turn
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
		if (isTurn && hands.get(playHand).getHandSize() == 2) {
			if (hands.get(playHand).getCollection().get(0).cardSoftValue() != hands.get(playHand).getCollection().get(1)
					.cardSoftValue()) { // compare values of both cards in hand
				return; // not able to split since not same rank
			} else {
				hands.add(new Hand()); // add new hand to Hand list
				hands.get(++playHand).addCard(hands.get(playHand).select()); // move card from first hand to second hand
				hands.get(++playHand).setBet(hands.get(playHand).getBet()); // set the bet for second hand to same as
																			// first hand
				hands.get(playHand).addCard(shoe); // draw card from shoe and add to the play hand
			}
		}
	}

	/**
	 * Displays the players name and the hands they control
	 */
	public void displayPlayer() {
		System.out.println(getName());
		for (int i = 0; i < hands.size(); i++) {
			hands.get(i).printCollection();
		}
	}
}
