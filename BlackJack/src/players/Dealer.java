package players;

public class Dealer extends Player {

	public Dealer() {
		super("Dealer");
	}

	public boolean busted() {
		if (getHand().handSoftValue() > 21) {
			return true;
		} else {
			return false;
		}
	}
}
