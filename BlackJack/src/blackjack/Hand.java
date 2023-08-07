package blackjack;

public class Hand extends CardCollection {

	private int cardIndex = 0;

	public Hand(int handSize) {
		super(handSize);
	}

	public void insertCard(CardCollection deck) {
		getCollection()[cardIndex++] = deck.select();
	}
}
