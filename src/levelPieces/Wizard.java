package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import java.util.random;

public class Wizard extends GamePiece {

	public Wizard(char symbol, String label, int location) {
		super(symbol, label, location);
		
	}

	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		if(Math.abs(this.getLocation() - playerLocation) == 2) {
			if()
		}
		return null;
	}

}
