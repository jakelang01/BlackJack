package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Card.Rank;
import cards.Card.Suit;

public class Shoe extends CardCollection {
	
	private int decks;

	/**
	 * Creates a new shoe object and fills it as many times as there are decks
	 * @param numDecks - the number of decks in the shoe
	 */
	public Shoe(int numDecks) {
		super();
		decks = numDecks;
		for (int i = 0; i < decks; i++) {
			fill();
		}
	}

	/**
	 * Fills the shoe with every rank and suit combination to simulate a full deck
	 * (Joker not included)
	 */
	public void fill() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				getCollection().add(new Card(r, s));
			}
		}
	}
}
