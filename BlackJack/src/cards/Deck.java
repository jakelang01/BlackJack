package cards;

import cards.Card.Rank;
import cards.Card.Suit;

public class Deck extends CardCollection {

	private static final int standardDeck = 52;
	
	public Deck() {
		super(standardDeck);
		fill();
	}
	
	public void fill() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				getCollection().add(new Card(r, s));
			}
		}
	}
}
