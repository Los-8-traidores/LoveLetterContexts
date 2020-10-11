package cards;

import Contexts.*;
import model.*;

public class Guard extends Card {
	protected final int strength = 1;
	protected final String name = "Guardia";
	protected final String effectDesc = "Elige a otro jugador para adivinar su carta (de tipo no guardia). Si la adivinas correctamente, el jugador queda descalificado";
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
		Context context = new ContextGuard(caller, card); //en caso de querer hacer tests usamos el otro ctor de 4 parametros
		context.apply();
	}
}

