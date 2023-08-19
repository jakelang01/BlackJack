package unitTests;

import cards.Shoe;
import players.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player p = new Player("Jake");
		Shoe shoe = new Shoe(2);
		
		System.out.println("number of hands");
		System.out.println(p.numberOfHands());
		
		System.out.println("\nadd and get bankroll");
		p.addBankroll(100);
		System.out.printf("$%.2f\n", p.getBankroll());
		p.addBankroll(25);
		System.out.printf("$%.2f\n", p.getBankroll());
		
		System.out.println("\nget play hand");
		p.getHand().printCollection();
		
		System.out.println("\nget name");
		System.out.println(p.getName());
		
		System.out.println("\nhit card");
		p.hit(shoe);
		p.getHand().printCollection();
		p.hit(shoe);
		p.getHand().printCollection();
		
		System.out.println("\nsurrender 25 bet");
		p.getHand().setBet(25);
		p.surrender();
		p.getHand().printCollection();
		System.out.printf("$%.2f\n", p.getBankroll());
		
		System.out.println("\nstay");
		p.stay();
		System.out.println(p.isTurn());
		p.changeTurn();
		System.out.println(p.isTurn());
		
		
		
		System.out.println("\ndouble down");
		p.doubleDown(shoe);
		p.getHand().printCollection();
		System.out.printf("$%.2f", p.getHand().getBet());
		
		
	}
}
