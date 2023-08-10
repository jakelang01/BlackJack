package players;

public class Dealer extends Player {

	public Dealer() {
		super("Dealer");
	}

	public boolean busted() {
		if (getHand(0).getSoftValue() > 21) {
			return true;
		} else {
			return false;
		}
	}
}
