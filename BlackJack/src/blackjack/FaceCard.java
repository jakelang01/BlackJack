package blackjack;

public class FaceCard extends Card {

	public FaceCard(Rank r, Suit s) {
		super(r, s);
	}

	@Override
	public int getSoftValue() {
		return 10;
	}

	@Override
	public int getHardValue() {
		return 10;
	}
}
