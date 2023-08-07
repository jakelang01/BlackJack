package cards;

import java.util.ArrayList;
import java.util.Collections;

public class CardCollection {

	private ArrayList<Card> collection;
	private int cardIndex = 0;

	public CardCollection(int numCards) {
		collection = new ArrayList<Card>();
	}

	public void shuffle() {
		Collections.shuffle(collection);
	}

	public Card select() {
		return collection.get(cardIndex++);
	}

	public void printCollection() {
		System.out.println(collection.toString());
	}

	public ArrayList<Card> getCollection() {
		return collection;
	}
}
