package blackjack;

import java.util.Random;

import blackjack.Card.Rank;
import blackjack.Card.Suit;

public class Shoe extends CardCollection {
	private Card[] shoe;

	public Shoe(int decks) {
		fill(decks);
		shuffle(shoe);
	}

	public void fill(int decks) {
		shoe = new Card[decks * 52];

		for (int i = 0; i < decks; i++) {
			for (Suit s : Suit.values()) {
				for (Rank r : Rank.values()) {
					shoe[i] = new Card(r, s);
					i++;
				}
			}
		}
	}
}
