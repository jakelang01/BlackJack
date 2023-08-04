package blackjack;

public class Hand
{
	private CardCollection hand;
	
	public Hand(int handSize, Card[] deck)
	{
		hand = new CardCollection(2);
		fill(handSize, deck);
	}
	
	public void fill(int handSize, Card[] deck)
	{
		for(int i = 0; i < handSize; i++)
		{
			hand.select(deck);
		}
	}
}
