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
		int i = 0;
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				getCollection()[i] = new Card(r, s);
				i++;
			}
		}
	}
}