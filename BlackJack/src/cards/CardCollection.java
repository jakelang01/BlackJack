package cards;

import java.util.Arrays;
import java.util.Collections;

public class CardCollection {

	private Card collection[];
	private int cardIndex = 0;

	public CardCollection(int numCards) {
		collection = new Card[numCards];
	}

	public void shuffle() {
		Collections.shuffle(Arrays.asList(collection));
	}

	public Card select() {
		return collection[cardIndex++];
	}

	public void printCollection() {
		for (int i = 0; i < collection.length; i++) {
			System.out.println(collection[i]);
		}
	}

	public Card[] getCollection() {
		return collection;
	}
}
