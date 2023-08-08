package game;

import cards.Hand;

/**
 * 
 * @author Jake Langenfeld
 *
 */

public class Player {
	private String name;
	private Hand hand;

	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}

	public String getName() {
		return name;
	}
}
