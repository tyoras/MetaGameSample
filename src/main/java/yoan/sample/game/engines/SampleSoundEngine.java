package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.engines.SoundEngine;
import yoan.game.util.errors.GameErrors;
import yoan.game.util.errors.GameException;
import yoan.game.util.logs.Log;
import yoan.sample.game.engines.events.SampleEngineEvent;

public class SampleSoundEngine extends SoundEngine<SampleEngineEvent> {
	private int i = 0;

	public SampleSoundEngine(Game<SampleEngineEvent> parent) {
		super(parent);
	}

	public void frame() throws GameException {
		i++;
		Log.debug(getType(), "frame " + i);
		processQueue();
	}

	protected void processEvent(SampleEngineEvent event) throws GameException {
		if (event != null) {
			Log.debug(getType(), "emet le bruit : "+ event.getData());
		} else {
			GameErrors.throwError(getType(), "Problème");
		}
	}

	@Override
	protected boolean checkInitArgs(String... initArgs){
		//pas d'argument d'initialisation
		return true;
	}
}
