package blackjack;

import blackjack.Card.Suit;

import java.util.Random;

import blackjack.Card.Rank;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("print out a card");
		Card card = new Card(Rank.Jack, Suit.Clubs);
		System.out.println(card.toString());
		
		System.out.println("\nprint out a random card");
		Random rand = new Random();
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		Card newCard = new Card(ranks[rand.nextInt(ranks.length)], suits[rand.nextInt(suits.length)]);
		System.out.println(newCard.toString());
		
		System.out.println("\nprint out the deck");
		Deck deck = new Deck();
		deck.printCollection();
		
		System.out.println("\nprint 2 deck shoe");
		Shoe shoe = new Shoe(2);
		shoe.printCollection();
		System.out.println("\n2 decks shuffled");
		shoe.shuffle();
		shoe.printCollection();
		
		System.out.println("\nprint out a hand");
		Hand hand = new Hand(2);
		hand.insertCard(deck);
		hand.printCollection();
		hand.insertCard(deck);
		hand.printCollection();
		
		System.out.println("\nprint 3 deck shoe");
		Shoe shoe3 = new Shoe(3);
		shoe3.printCollection();
		System.out.println("\n3 decks shuffled");
		shoe3.shuffle();
		shoe3.printCollection();
	}

}
