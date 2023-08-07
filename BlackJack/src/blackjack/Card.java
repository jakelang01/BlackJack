package blackjack;

public class Card {
	
	private Suit suit;
	private Rank rank;
	
	public enum Suit {
		Clubs, Diamonds, Hearts, Spades
	};

	public enum Rank {
		Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);

		private int value;
		
		Rank(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
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
