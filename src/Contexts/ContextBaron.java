package Contexts;

import java.util.Scanner;

import cards.*;
import model.Player;

public class ContextBaron extends Context {

	Player caller;
	Player target;
	Card card;

	public ContextBaron(Player caller, Player target, Card card) { // Ctor para Tests hardcodeados
		this.caller = caller;
		this.target = target;
		this.card = card;
	}

	public ContextBaron(Player caller, Card card) { // Ctor para implementacion del juego
		this.caller = caller;
		this.card = card;
		this.target = null;
	}

	@Override
	public void apply() {

		if (this.target == null) { //para saber si es un test o el juego dependiendo el ctor usado
			System.out.println("Ingrese el ID del jugador objetivo");

			Scanner player = new Scanner(System.in);
			this.target = playerList.get(player.nextInt());
			player.close();

			while (!this.target.isAlive()) {
				System.out.println("El jugador esta eliminado de esta ronda");
				player = new Scanner(System.in);
				this.target = playerList.get(player.nextInt());
				player.close();
			}
		}
		
		if (this.card.getCardStrength() > this.target.getCard1().getCardStrength())
			this.target.setAlive(false);
		else
			this.caller.setAlive(false);
	}

}
