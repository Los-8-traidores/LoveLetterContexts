package Contexts;
import java.util.ArrayList;
import java.util.List;

import model.*;

public abstract class Context {
	
	public List<Player> playerList = new ArrayList<Player>();
	
	public abstract void apply();

}
