package unitTests;

import cards.Card;
import cards.Shoe;
import cards.Card.Rank;
import cards.Card.Suit;

public class ShoeTest {

	public static void main(String[] args) {
		System.out.println("print out the shoe");
		Shoe shoe = new Shoe(2);
		shoe.printCollection();
		
		System.out.println("\ncollection size");
		System.out.println(shoe.collectionSize());
		
		System.out.println("\nshuffled deck");
		shoe.shuffle();
		shoe.printCollection();
		
		System.out.println("\nselect a card");
		System.out.println(shoe.select());
		
		System.out.println("\nremove card from deck and print");
		shoe.removeCard();
		shoe.printCollection();
		
		System.out.println("\nget collection");
		System.out.println(shoe.getCollection());
		
		System.out.println("\ncollection size");
		System.out.println(shoe.collectionSize());
		
		System.out.println("\ncontains ace");
		System.out.println(shoe.containsAce());
		
		System.out.println("\nremove all aces");
		shoe.removeCard(new Card(Rank.Ace, Suit.Hearts));
		shoe.removeCard(new Card(Rank.Ace, Suit.Spades));
		shoe.removeCard(new Card(Rank.Ace, Suit.Diamonds));
		shoe.removeCard(new Card(Rank.Ace, Suit.Clubs));
		shoe.printCollection();
		System.out.println(shoe.containsAce());
	}

}
