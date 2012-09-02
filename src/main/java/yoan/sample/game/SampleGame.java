package yoan.sample.game;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.Module;
import yoan.sample.game.engines.SampleGameEngine;
import yoan.sample.game.engines.SampleGraphicEngine;
import yoan.sample.game.engines.SampleSoundEngine;

public class SampleGame extends Game {

	public void initModules() {
		Log.debug("init des modules");
		modules.put(Module.GAME, new SampleGameEngine(this));
		modules.put(Module.GRAPHIC, new SampleGraphicEngine(this));
		modules.put(Module.SOUND, new SampleSoundEngine(this));
	}

	@Override
	public void stop() {
		super.stop();
		Log.debug("Stop!");
	}
}
