package Contexts;
import cards.*;
import model.Player;

public class ContextHandmaid extends Context {

	Player caller;
	Card card; 
	
	public ContextHandmaid(Player caller, Card card) { // Ctor para Tests hardcodeados
		this.caller = caller;
		this.card = card;
	}



	@Override
	public void apply() {
		this.caller.setProtected(true);		
	}

}
