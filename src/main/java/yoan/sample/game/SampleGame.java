package yoan.sample.game;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.Module;

public class SampleGame extends Game {
	
	public void initModules(){
		Log.debug("init des modules");
		modules.put(Module.GAME, new TestGameEngine(this));
		modules.put(Module.GRAPHIC, new TestGraphicEngine(this));
		modules.put(Module.SOUND, new TestSoundEngine(this));
	}
	
	@Override
	public void stop(){
		super.stop();
		Log.debug("Stop!");
	}
}
