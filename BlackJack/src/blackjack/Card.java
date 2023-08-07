package blackjack;

public class Card {

	private Suit suit;
	private Rank rank;

	public enum Suit {
		Clubs, Diamonds, Hearts, Spades
	};

	public enum Rank {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;
	};

	public Card(Rank r, Suit s) {
		suit = s;
		rank = r;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public int getSoftValue() {
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
		default:
			return 10;
		}
	}

	public int getHardValue() {
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
		default:
			return 10;
		}
	}

	@Override
	public String toString() {
		return getRank() + " of " + getSuit();
	}

}
