package cards;

public class Hand extends CardCollection {

	public Hand(int handSize) {
		super(handSize);
	}

	public void insertCard(CardCollection deck) {
		getCollection().add(deck.select());
	}
}
