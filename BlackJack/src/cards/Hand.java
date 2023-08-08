package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

public class Hand extends CardCollection {

	private int bet;

	/**
	 * Creates a new hand object
	 */
	public Hand() {
		super();
		bet = 0;
	}

	/**
	 * Adds the first card from the shoe to the hand
	 * 
	 * @param deck - the deck that the hand is taking from
	 */
	public void addCard(CardCollection col) {
		getCollection().add(col.select());
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

	/**
	 * Calculates the soft value of the hand
	 * 
	 * @return - returns the soft value of the hand
	 */
	public int getSoftValue() {
		int value = 0;
		for (int i = 0; i < getHandSize(); i++) {
			value += getCollection().get(i).getSoftValue();
		}
		return value;
	}

	/**
	 * Calculates the hard value of the hand
	 * 
	 * @return - returns the hard value of the hand
	 */
	public int getHardValue() {
		int value = 0;
		for (int i = 0; i < getHandSize(); i++) {
			value += getCollection().get(i).getHardValue();
		}
		return value;
	}

	/**
	 * Checks if the hand only has 2 dealt cards and they equals 21
	 * 
	 * @return - returns true if the hand is a blackjack otherwise returns false
	 */
	public boolean blackjack() {
		if (getCollection().size() == 2 && getSoftValue() == 21) {
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
		if (getHardValue() > 21) {
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
