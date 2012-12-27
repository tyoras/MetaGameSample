package yoan.sample;

import yoan.game.util.errors.GameException;
import yoan.sample.game.SampleGame;

/**
 * @author yoan
 * 
 */
public class Main {
	public static void main(String[] args) {
		SampleGame game = new SampleGame();
		try {
    		game.init("50", "100");
    		game.setRunning(true);
    		game.run();
		} catch(GameException gex) {
			if (gex.isBloquant()) {
				System.out.println("Erreur fatale!");
				System.exit(0);
			} else {
				System.out.println("Erreur bloquante non traitée!");
			}
		}
	}
}
