package cards;

import model.Player;

public class Princess extends Card {
	protected final int strength = 8;
	protected final String name = "Princesa";
	protected final String effectDesc = "Si descartas esta carta, quedas descalificado";
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

	@Override
	public void effect(Player player, Card card1) {
		// TODO Auto-generated method stub
		
	}
}
