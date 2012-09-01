package yoan.sample;

import yoan.sample.game.TestGame;

/**
 * @author yoan
 *
 */
public class Main {
	public static void main(String[] args) {
		TestGame game = new TestGame();
		game.initModules();
		game.setRunning(true);
		game.run();
	}
}
