package unitTests;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import cards.Card;
import cards.Hand;
import cards.Card.Rank;
import cards.Card.Suit;
import cards.Deck;

public class HandTest {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		System.out.println("print out the hand");
		Hand hand = new Hand();
		hand.addCard(deck);
		hand.addCard(deck);
		hand.printCollection();
		
		System.out.println("\nhand size");
		System.out.println(hand.getHandSize());
		
		System.out.println("\nshuffled deck");
		hand.shuffle();
		hand.printCollection();
		
		System.out.println("\nremove card from hand and print");
		hand.removeCard();
		hand.printCollection();
		
		System.out.println("\nget collection");
		System.out.println(hand.getCollection());
		
		System.out.println("\ncollection size");
		System.out.println(hand.collectionSize());
		
		System.out.println("\ncontains ace");
		System.out.println(hand.containsAce());
		
		System.out.println("\ncheck if more than one ace");
		System.out.println(hand.moreThanOneAce());
		
		hand.addCard(new Card(Rank.Ace, Suit.Spades));
		
		System.out.println("\ncheck if more than one ace again");
		System.out.println(hand.moreThanOneAce());
		hand.printCollection();
		
		System.out.println("\nhand soft value");
		System.out.println(hand.handSoftValue());
		
		System.out.println("\nhand hard value");
		System.out.println(hand.handHardValue());
		
		System.out.println("\ncheck blackjack");
		System.out.println(hand.blackjack());
		hand.removeCard(new Card(Rank.Ace, Suit.Spades));
		hand.addCard(new Card(Rank.Jack, Suit.Clubs));
		hand.printCollection();
		System.out.println(hand.blackjack());
		hand.addCard(new Card(Rank.Five, Suit.Clubs));
		hand.printCollection();
		System.out.println(hand.blackjack());
		
		System.out.println("\ncheck busted");
		hand.addCard(new Card(Rank.Ten, Suit.Diamonds));
		hand.printCollection();
		System.out.println(hand.busted());
		
		System.out.println("\nremove all aces");
		hand.removeCard(new Card(Rank.Ace, Suit.Hearts));
		hand.removeCard(new Card(Rank.Ace, Suit.Spades));
		hand.removeCard(new Card(Rank.Ace, Suit.Diamonds));
		hand.removeCard(new Card(Rank.Ace, Suit.Clubs));
		hand.printCollection();
		System.out.println(hand.containsAce());
		
		System.out.println("\nset bet and get bet");
		hand.setBet(20);
		System.out.println(hand.getBet());
	}

}
