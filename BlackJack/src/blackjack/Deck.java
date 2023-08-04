package blackjack;

import java.util.Random;

import blackjack.Card.Rank;
import blackjack.Card.Suit;
import java.util.Arrays;
import java.util.Collections;

public class Deck
{
  private Card[] deck;
  private Random rand;
  
  public Deck()
  {
	  rand = new Random();
	  fill();
	  shuffle(deck);
  }
  
  public void shuffle(Card[] deck)
  {
	  Collections.shuffle(Arrays.asList(deck));
  }
  
  public Card select(Card[] deck)
  {
	  int index = rand.nextInt(52);
	  return deck[index];
  }
  
  public void fill()
  {
	  deck = new Card[52];
	
	  int i = 0;
	  for(Suit s : Suit.values())
	  {
	  	for(Rank r : Rank.values())
	  	{
	  		deck[i] = new Card(r,s);
	  		i++;
	  	}
	  }
  }
}
