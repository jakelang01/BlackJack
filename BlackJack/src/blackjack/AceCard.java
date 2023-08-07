package blackjack;

public class AceCard extends Card {
	
	public AceCard(Suit suit) {
		super(Rank.Ace, suit);
	}
	
	@Override
	public int getSoftValue() {
		return 11;
	}
	
	@Override
	public int getHardValue() {
		return 1;
	}
}
