package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class CardCollection {

	private ArrayList<Card> collection;
	
	/**
	 * Keeps the card index at 0 so always picking and removing first card
	 */
	private final int firstCard = 0;

	/**
	 * Initializes the new card collection to an ArrayList so it can be of any size
	 */
	public CardCollection() {
		collection = new ArrayList<Card>();
	}

	/**
	 * Shuffles the card collection
	 */
	public void shuffle() {
		Collections.shuffle(collection);
	}

	/**
	 * Selects the first card in the collection
	 * @return - returns the first card in the collection
	 */
	public Card select() {
		return collection.get(firstCard);
	}
	
	/**
	 * Removes the first card in the collection
	 */
	public void removeCard() {
		collection.remove(firstCard);
	}

	/**
	 * Prints the entire collection
	 */
	public void printCollection() {
		System.out.println(collection.toString());
	}

	/**
	 * Gets the collection so it can be edited
	 * @return - returns the collection
	 */
	public ArrayList<Card> getCollection() {
		return collection;
	}
	
	public int collectionSize() {
		return collection.size();
	}
}
