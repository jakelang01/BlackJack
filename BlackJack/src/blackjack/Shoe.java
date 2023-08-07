package blackjack;

import blackjack.Card.Rank;
import blackjack.Card.Suit;

public class Shoe extends CardCollection {

	private static final int standardDeck = 52;
	private int index = 0;

	public Shoe(int decks) {
		super(decks * standardDeck);
		for (int i = 0; i < decks; i++) {
			fill();
		}
	}

	public void fill() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				getCollection()[index] = new Card(r, s);
				index++;
			}
		}
	}
}
