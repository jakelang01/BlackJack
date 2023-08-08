package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Card.Rank;
import cards.Card.Suit;

public class Deck extends CardCollection {

	/**
	 * Creates a new deck object and fills it
	 */
	public Deck() {
		super();
		fill();
	}

	/**
	 * Fills the deck with every rank and suit combination to simulate a full deck
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
