package blackjack;

public class Hand extends CardCollection {
	private CardCollection hand;

	public Hand(int handSize) {
		super(handSize);
	}

	public void insertCard(CardCollection deck)
	{
		collection[cardIndex] = deck.select();
	}
}
