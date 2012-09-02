package yoan.sample;

import yoan.sample.game.SampleGame;

/**
 * @author yoan
 * 
 */
public class Main {
	public static void main(String[] args) {
		SampleGame game = new SampleGame();
		game.initModules();
		game.setRunning(true);
		game.run();
	}
}
