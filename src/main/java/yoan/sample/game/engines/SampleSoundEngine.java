package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.SoundEngine;
import yoan.sample.game.engines.events.SampleEngineEvent;

public class SampleSoundEngine extends SoundEngine<SampleEngineEvent> {
	private int i = 0;

	public SampleSoundEngine(Game<SampleEngineEvent> parent) {
		super(parent);
		Log.debug("création du SoundEngine");
	}

	public void frame() {
		i++;
		Log.debug("frame " + i + " du SoundEngine");
		processQueue();
	}

	protected void processEvent(SampleEngineEvent event) {
		if (event != null) {
			Log.debug("SoundEngine emet le bruit : "+ event.getData());
		} else {
			Log.error("Problème avec le SoundEngine");
		}
		
	}
}
