package cards;

/**
 * 
 * @author Jake Langenfeld
 *
 */

import java.util.ArrayList;
import java.util.Collections;

import cards.Card.Rank;

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
	 * 
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

	public void removeCard(Card card) {
		for (int i = 0; i < getCollection().size(); i++) {
			if (getCollection().get(i).equals(card)) {
				getCollection().remove(i);
			}
		}
	}

	/**
	 * Prints the entire collection
	 */
	public void printCollection() {
		System.out.println(collection.toString());
	}

	/**
	 * Gets the collection so it can be edited
	 * 
	 * @return - returns the collection
	 */
	public ArrayList<Card> getCollection() {
		return collection;
	}

	/**
	 * Returns the size of the collection
	 * 
	 * @return - the size of the collection
	 */
	public int collectionSize() {
		return collection.size();
	}

	/**
	 * Checks the collection to see if there is an ace
	 * 
	 * @return - true if it contains an ace otherwise false
	 */
	public boolean containsAce() {
		for (int i = 0; i < collectionSize(); i++) {
			if (getCollection().get(i).getRank() == Rank.Ace) {
				return true;
			}
		}
		return false;
	}
}
