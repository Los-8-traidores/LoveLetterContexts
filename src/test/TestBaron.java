package test;

import cards.*;
import model.Player;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class TestBaron {
	
	@Test
	void testCardCreation() {
		Card cardBaron = new Baron();

		assertEquals("Barón", cardBaron.getCardName());
		assertEquals("Comparas cartas con otro jugador, el que tenga la menor queda descalificado", cardBaron.getCardEffectDesc());
		assertEquals(3, cardBaron.getCardStrength());
	}


	@Test
	void testEffect() {
		Player player1 = new Player(new Baron());
		Player player2 = new Player(new Guard());
		
		player1.getCard1().effect(player1, player2);
		
		assertEquals(false, player2.isAlive());
		
		Player player3 = new Player(new Baron());
		Player player4 = new Player(new Handmaid());
		
		player3.getCard1().effect(player3, player4);
		
		assertEquals(false, player3.isAlive());
		
		
		
	}
	
}