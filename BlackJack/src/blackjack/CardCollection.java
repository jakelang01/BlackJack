package blackjack;

import java.util.Random;

import blackjack.Card.Rank;
import blackjack.Card.Suit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CardCollection {

	private Card collection[];
	private Random rand;
	private static int cardIndex = 0;

	public CardCollection(int numCards) {
		rand = new Random();
		collection = new Card[numCards];
	}

	public void shuffle() {
		Collections.shuffle(Arrays.asList(collection));
	}

	public Card select() {
		return collection[cardIndex++];
	}
	
	public void insertCard(CardCollection deck)
	{
		collection[cardIndex] = deck.select();
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

	public void printCollection() {
		for(int i = 0; i < collection.length; i++)
		{
			System.out.println(collection[i]);
		}
	}
}
