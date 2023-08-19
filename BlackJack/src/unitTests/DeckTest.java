package unitTests;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Card;
import cards.Deck;
import cards.Card.Rank;
import cards.Card.Suit;

public class DeckTest {

	public static void main(String[] args) {

		System.out.println("print out the deck");
		Deck deck = new Deck();
		deck.printCollection();

		System.out.println("\ncollection size");
		System.out.println(deck.collectionSize());

		System.out.println("\nshuffled deck");
		deck.shuffle();
		deck.printCollection();

		System.out.println("\nselect a card");
		System.out.println(deck.select());

		System.out.println("\nremove card from deck and print");
		deck.removeCard();
		deck.printCollection();

		System.out.println("\nget collection");
		System.out.println(deck.getCollection());

		System.out.println("\ncollection size");
		System.out.println(deck.collectionSize());

		System.out.println("\ncontains ace");
		System.out.println(deck.containsAce());

		System.out.println("\nremove all aces");
		deck.removeCard(new Card(Rank.Ace, Suit.Hearts));
		deck.removeCard(new Card(Rank.Ace, Suit.Spades));
		deck.removeCard(new Card(Rank.Ace, Suit.Diamonds));
		deck.removeCard(new Card(Rank.Ace, Suit.Clubs));
		deck.printCollection();
		System.out.println(deck.containsAce());
	}

}
