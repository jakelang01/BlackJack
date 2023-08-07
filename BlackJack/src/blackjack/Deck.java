package blackjack;

import blackjack.Card.Rank;
import blackjack.Card.Suit;

public class Deck extends CardCollection {

	private static final int standardDeck = 52;
	
	public Deck() {
		super(standardDeck);
	}
	
	public void fill() {
		int i = 0;
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				collection[i] = new Card(r, s);
				i++;
			}
		}
	}
}
