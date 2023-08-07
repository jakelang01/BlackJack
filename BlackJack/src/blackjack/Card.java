package blackjack;

public class Card {
	public enum Suit {
		Clubs, Diamonds, Hearts, Spades
	};

	public enum Rank {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	};

	private Suit suit;
	private Rank rank;

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

	public String toString() {
		return getRank() + " of " + getSuit();
	}

}
