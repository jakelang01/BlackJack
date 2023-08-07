package blackjack;

public class Shoe extends CardCollection {
	private CardCollection shoe;
	private static final int standardDeck = 52;

	public Shoe(int decks) {
		super(decks * standardDeck);
	}

}
