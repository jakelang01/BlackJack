package cards;

import cards.Card.Rank;
import cards.Card.Suit;

public class Shoe extends CardCollection {

	private static final int standardDeck = 52;

	public Shoe(int decks) {
		super(decks * standardDeck);
		for (int i = 0; i < decks; i++) {
			fill();
		}
	}

	public void fill() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				getCollection().add(new Card(r, s));
			}
		}
	}
}
