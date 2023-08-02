package blackjack;

import java.util.Random;

public class NewCard {

	public enum Suit
	{
		  CLUBS
		, DIAMONDS
		, HEARTS
		, SPADES
	};
	
	public enum Rank
	{
		  Ace
		, Two
		, Three
		, Four
		, Five
		, Six
		, Seven
		, Eight
		, Nine
		, Ten
		, Jack
		, Queen
		, King
	};
	
	private Suit suit;
	private final int suitSize = suit.values().length;
	private Rank rank;
	private Random rand;
	
	public NewCard(Rank r, Suit s)
	{
		suit = s;
		rank = r;
	}
	
	public Rank getRank()
	{
		return rank;
	}
	
	public Suit getSuit()
	{
		return suit;
	}
	
	public String toString()
	{
		return getRank() + " of " + getSuit();
	}
	
}
