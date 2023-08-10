package players;

public class Dealer extends Player {

	/**
	 * Creates a new Dealer
	 */
	public Dealer() {
		super("Dealer");
		changeTurn(); // set the dealers turn to false
	}

	/**
	 * Checks if the dealer busted
	 * 
	 * @return - true if busted otherwise false
	 */
	public boolean busted() {
		if (getHand().handSoftValue() > 21) {
			return true;
		} else {
			return false;
		}
	}
}
