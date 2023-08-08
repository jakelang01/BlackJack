package unitTests;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import java.util.Random;

import cards.Card;
import cards.Card.Rank;
import cards.Card.Suit;

public class CardTest {

	public static void main(String[] args) {
		System.out.println("print out a card");
		Card card = new Card(Rank.Ace, Suit.Clubs);
		System.out.println(card.toString());
		System.out.println(card.getRank());
		System.out.println(card.getSuit());
		
		System.out.println("\nprint out a random card");
		Random rand = new Random();
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();
		Card newCard = new Card(ranks[rand.nextInt(ranks.length)], suits[rand.nextInt(suits.length)]);
		System.out.println(newCard.toString());
		
		System.out.println(card.getSoftValue());
		System.out.println(card.getHardValue());
		System.out.println(newCard.getSoftValue());
		System.out.println(newCard.getHardValue());
	}

}
