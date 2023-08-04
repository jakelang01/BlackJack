package blackjack;

public class Player 
{
	private String name;
	private Card[] hand;
	
	public Player(String name)
	{
		this.name = name;
		hand = new Card[2];
	}
	
	public String getName()
	{
		return name;
	}
}
