package unitTests;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Deck;
import cards.Hand;
import cards.Shoe;

public class CardCollectionTest {

	public static void main(String[] args) {

		System.out.println("print out the deck");
		Deck deck = new Deck();
		deck.printCollection();

		System.out.println("\nprint 2 deck shoe");
		Shoe shoe = new Shoe(2);
		shoe.printCollection();
		System.out.println("\n2 decks shuffled");
		shoe.shuffle();
		shoe.printCollection();

		System.out.println("\nprint out a hand");
		Hand hand = new Hand();
		hand.addCard(deck);
		hand.printCollection();
		hand.addCard(deck);
		hand.printCollection();

		System.out.println("\npick first card from deck and shuffled shoe");
		System.out.println(deck.select());
		System.out.println(shoe.select());

		System.out.println(hand.getCollection());
	}

}
