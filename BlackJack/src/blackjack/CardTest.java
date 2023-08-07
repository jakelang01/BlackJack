package blackjack;

import blackjack.Card.Suit;
import blackjack.Card.Rank;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("print out a card");
		Card card = new Card(Rank.Jack, Suit.Clubs);
		System.out.println(card.toString() + "\n");
		
		System.out.println("print out the deck");
		CardCollection deck = new CardCollection(52);
		deck.fill(1);
		deck.printCollection();
		
		System.out.println("print 2 deck shoe");
		Shoe shoe = new Shoe(2);
		shoe.fill(2);
		shoe.printCollection();
		
		System.out.println("print out a hand");
		Hand hand = new Hand(2);
		hand.insertCard(deck);
		hand.printCollection();
		hand.insertCard(deck);
		hand.printCollection();
	}

}
