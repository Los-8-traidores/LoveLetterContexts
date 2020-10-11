package cards;

import model.Player;

public class King extends Card {
	protected final int strength = 6;
	protected final String name = "Rey";
	protected final String effectDesc = "Elige otro jugador para intercambiar cartas";
	protected final boolean needsTarget = true;
 			
	@Override
	public int getCardStrength() {
		return strength;
	}

	@Override
	public String getCardName() {
		return name;
	}

	@Override
	public String getCardEffectDesc() {
		return effectDesc;
	}
//
//	
//	public void effect(Player playerOnTurn, Player playerTarget) {
//		Card auxCard = playerTarget.getCard1();
//		playerTarget.setCard1(playerOnTurn.getCard1());
//		playerOnTurn.setCard1(auxCard);
//	}

	@Override
	public void effect(Player player, Card card1) {
		// TODO Auto-generated method stub
		
	}

}
