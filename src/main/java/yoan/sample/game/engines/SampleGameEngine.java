package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.GameEngine;
import yoan.game.engines.Module;
import yoan.sample.game.engines.events.SampleEngineEvent;

public class SampleGameEngine extends GameEngine<SampleEngineEvent> {
	private int i = 0;

	public SampleGameEngine(Game<SampleEngineEvent> parent) {
		super(parent);
		Log.debug("création du GameEngine");
	}

	public void frame() {
		i++;
		Log.debug("frame " + i + " du GameEngine");
		if (i == 50) {
			Log.debug("envoi d'un evenement au module sonore");
			game.getModules().get(Module.SOUND).pushEvent(new SampleEngineEvent("bip"));
		} else if (i == 100) {
			game.stop();
		}
		processQueue();
	}

	protected void processEvent(SampleEngineEvent event) {
	}

}
