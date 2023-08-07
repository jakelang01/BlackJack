package blackjack;

public class FaceCard extends Card {

	public FaceCard() {
		super();
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
