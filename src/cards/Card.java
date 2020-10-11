package cards;

import model.Player;

public abstract class Card {
	
	public abstract int getCardStrength();
	public abstract String getCardName();
	public abstract String getCardEffectDesc();
	public abstract void effect(Player player, Card card1);
}
