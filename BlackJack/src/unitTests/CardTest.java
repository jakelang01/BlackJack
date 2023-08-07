package unitTests;

import java.util.Random;

import cards.Card;
import cards.Card.Rank;
import cards.Card.Suit;

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
		
		System.out.println();		
	}

}
