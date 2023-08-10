package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Card.Rank;

public class Hand extends CardCollection {

	private int bet = 0;

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
	 * Adds a specific card to the hand
	 * 
	 * @param card - the card to be added to the hand
	 */
	public void addCard(Card card) {
		getCollection().add(card);
	}

	public int getHandSize() {
		return getCollection().size();
	}

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

		if (moreThanOneAce()) {
			for (int i = 0; i < getHandSize(); i++) {
				if (getCollection().get(i).getRank() == Rank.Ace && ++numAce == 1) {
					value += getCollection().get(i).cardSoftValue();
				} else {
					value += getCollection().get(i).cardHardValue();
				}
			}
		} else {
			for (int i = 0; i < getHandSize(); i++) {
				value += getCollection().get(i).cardSoftValue();
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
		if (getCollection().size() == 2 && handSoftValue() == 21) {
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

	public void setBet(int bet) {
		this.bet = bet;
	}

	public int getBet() {
		return bet;
	}

}
