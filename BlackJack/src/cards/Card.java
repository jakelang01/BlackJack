package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

public class Card {

	private Suit suit;
	private Rank rank;

	public enum Suit {
		Clubs, Diamonds, Hearts, Spades
	};

	public enum Rank {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;
	};

	/**
	 * Creates a new card object
	 * 
	 * @param r - the rank of the card
	 * @param s - the suit of the card
	 */
	public Card(Rank r, Suit s) {
		suit = s;
		rank = r;
	}

	/**
	 * Returns the rank of the card
	 * 
	 * @return - the rank of the card
	 */
	public Rank getRank() {
		return rank;
	}

	/**
	 * Returns the suit of the card
	 * 
	 * @return - the suit of the card
	 */
	public Suit getSuit() {
		return suit;
	}

	/**
	 * Evaluates the rank enum to determine what soft value it holds
	 * 
	 * @return - returns the soft value of the card
	 */
	public int cardSoftValue() {
		switch (rank) {
		case Ace:
			return 11;
		case Two:
			return 2;
		case Three:
			return 3;
		case Four:
			return 4;
		case Five:
			return 5;
		case Six:
			return 6;
		case Seven:
			return 7;
		case Eight:
			return 8;
		case Nine:
			return 9;
		default: // ten, jack, queen, king
			return 10;
		}
	}

	/**
	 * Evaluates the rank enum to determine what hard value it holds
	 * 
	 * @return - returns the hard value of the card
	 */
	public int cardHardValue() {
		switch (rank) {
		case Ace:
			return 1;
		case Two:
			return 2;
		case Three:
			return 3;
		case Four:
			return 4;
		case Five:
			return 5;
		case Six:
			return 6;
		case Seven:
			return 7;
		case Eight:
			return 8;
		case Nine:
			return 9;
		default: // ten, jack, queen, king
			return 10;
		}
	}

	public boolean equals(Card card) {
		if (card.rank == this.rank && card.suit == this.suit) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Prints the rank and the suit of the card
	 */
	@Override
	public String toString() {
		return getRank() + " of " + getSuit();
	}

}
