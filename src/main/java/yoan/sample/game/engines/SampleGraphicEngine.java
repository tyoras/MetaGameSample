package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.engines.GraphicEngine;
import yoan.game.util.errors.GameException;
import yoan.game.util.logs.Log;
import yoan.sample.game.engines.events.SampleEngineEvent;

public class SampleGraphicEngine extends GraphicEngine<SampleEngineEvent> {
	private int i = 0;

	public SampleGraphicEngine(Game<SampleEngineEvent> parent) {
		super(parent);
	}

	public void frame() throws GameException {
		this.i += 1;
		Log.debug(getType(), "frame " + this.i);
		processQueue();
	}

	protected void processEvent(SampleEngineEvent event) {
	}

	@Override
	protected boolean checkInitArgs(String... initArgs){
		//pas d'argument d'initialisation
		return true;
	}
}