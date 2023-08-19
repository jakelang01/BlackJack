package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Card.Rank;
import cards.Card.Suit;

public class Hand extends CardCollection {

	private double bet = 0;

	/**
	 * Creates a new hand object
	 */
	public Hand() {
		super();
	}

	/**
	 * Adds the first card from the shoe to the hand
	 * 
	 * @param deck - the deck that the hand is taking from
	 */
	public void addCard(CardCollection col) {
		getCollection().add(col.select());
		col.removeCard();
	}

	/**
	 * Adds a specific card to the hand (used for splitting)
	 * 
	 * @param card - the card to be added to the hand
	 */
	public void addCard(Card card) {
		getCollection().add(card);
	}

	/**
	 * Returns the number of cards in the hand
	 * 
	 * @return - the number of cards in the hand
	 */
	public int getHandSize() {
		return getCollection().size();
	}

	/**
	 * Checks the hand to see if there is more than one ace
	 * 
	 * @return - true if there is more than one ace otherwise false
	 */
	public boolean moreThanOneAce() {
		int numAce = 0;
		for (int i = 0; i < getHandSize(); i++) {
			if (getCollection().get(i).getRank() == Rank.Ace) {
				numAce++;
			}
		}
		if (numAce >= 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Calculates the soft value of the hand
	 * 
	 * @return - returns the soft value of the hand
	 */
	public int handSoftValue() {
		int value = 0;
		int numAce = 0;

		if (moreThanOneAce()) { // checks if there's more than one ace in the hand
			for (int i = 0; i < getHandSize(); i++) {
				if (getCollection().get(i).getRank() == Rank.Ace && numAce == 0) { // checks if this is the first ace in
																					// the hand
					value += getCollection().get(i).cardSoftValue(); // adds the soft value for first ace
					numAce++; // increments so other aces use hard value
				} else {
					value += getCollection().get(i).cardHardValue(); // add hard value of every other card besides first
																		// ace
				}
			}
		} else { // only one ace
			for (int i = 0; i < getHandSize(); i++) {
				value += getCollection().get(i).cardSoftValue(); // add all soft values (only affects the ace)
			}
		}
		return value;
	}

	/**
	 * Calculates the hard value of the hand
	 * 
	 * @return - returns the hard value of the hand
	 */
	public int handHardValue() {
		int value = 0;
		for (int i = 0; i < getHandSize(); i++) {
			value += getCollection().get(i).cardHardValue();
		}
		return value;
	}

	/**
	 * Checks if the hand only has 2 dealt cards and they equals 21
	 * 
	 * @return - returns true if the hand is a blackjack otherwise returns false
	 */
	public boolean blackjack() {
		if (getCollection().size() == 2 && handSoftValue() == 21) { // if 2 cards are dealt and the soft values equal 21
																	// (ace and 10)
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks if the hard value of the hand is over 21
	 * 
	 * @return - returns true if the hand is busted
	 */
	public boolean busted() {
		if (handHardValue() > 21) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sets the bet for the hand
	 * 
	 * @param bet - the bet for the hand
	 */
	public void setBet(double bet) {
		this.bet = bet;
	}

	/**
	 * Returns the bet for the hand
	 * 
	 * @return - the bet for the hand
	 */
	public double getBet() {
		return bet;
	}

}
