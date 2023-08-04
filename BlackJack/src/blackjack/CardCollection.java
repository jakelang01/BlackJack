package blackjack;

import java.util.Random;

import blackjack.Card.Rank;
import blackjack.Card.Suit;
import java.util.Arrays;
import java.util.Collections;

public class CardCollection {
	private Card[] collection;
	private Random rand;
	private static final int standardDeck = 52;

	/**
	 * CardCollection() creates a standard size 52-card deck.
	 */
	public CardCollection() {
		rand = new Random();
		collection = new Card[standardDeck];
		fill();
		shuffle(collection);
	}

	/**
	 * CardCollection() creates a card collection with a certain amount of cards
	 * 
	 * @param numCards - declares how many cards are in the collection
	 */
	public CardCollection(int numCards) {
		rand = new Random();
		collection = new Card[numCards];
		fill();
		shuffle(collection);
	}

	/**
	 * Shuffles the card collection
	 * 
	 * @param collection - collection to be shuffled
	 */
	public void shuffle(Card[] collection) {
		Collections.shuffle(Arrays.asList(collection));
	}

	/**
	 * Selects a random card from the inputed collection
	 * 
	 * @param collection - collection from which the card is selected
	 * @return - returns the random card
	 */
	public Card select(Card[] collection) {
		int index = rand.nextInt(collection.length);
		return collection[index];
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

	public Card[] getCollection() {
		return collection;
	}
}
