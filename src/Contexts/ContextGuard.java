package Contexts;

import model.*;

import java.util.Scanner;
import cards.*;

public class ContextGuard extends Context {

	Player caller;
	Player target;
	Card card;
	String gessedCard;

	public ContextGuard(Player caller, Player target, Card card, String guessedCard) { // Ctor para Tests hardcodeados
		this.caller = caller;
		this.target = target;
		this.card = card;
		this.gessedCard = guessedCard;
	}

	public ContextGuard(Player caller, Card card) { // Ctor para implementacion del juego
		this.caller = caller;
		this.card = card;
		this.target = null;
		this.gessedCard = null;
	}

	@Override
	public void apply() {

		if (this.target) {//para saber si es un test o el juego dependiendo el ctor usado
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

		if (hasToApply())
			this.target.setAlive(false);
	}

	public boolean hasToApply() {
		if (this.gessedCard == null) {
			System.out.println("Ingrese el nombre de la carta que cree que tiene el jugador"); // Estos prints se sacan
																								// para el test pero
																								// esta bueno tenerlos
																								// en cuenta para la
																								// parte grafica

			Scanner in = new Scanner(System.in);
			this.gessedCard = in.nextLine();
			in.close();
		}

		if (this.target.getCard1().getCardName() == this.gessedCard)
			return true;
		return false;
	}
}
