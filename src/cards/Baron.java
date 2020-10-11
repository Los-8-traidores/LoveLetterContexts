package cards;

import Contexts.*;
import model.Player;

public class Baron extends Card {
	protected final int strength = 3;
	protected final String name = "Barón";
	protected final String effectDesc = "Comparas cartas con otro jugador, el que tenga la menor queda descalificado";
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
	public void effect(Player caller, Card card) {
		Context context = new ContextBaron(caller, card);
		context.apply();
	}

}
