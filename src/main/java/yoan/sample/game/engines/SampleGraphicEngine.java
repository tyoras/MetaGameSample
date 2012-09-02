package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.GraphicEngine;
import yoan.sample.game.engines.events.SampleEngineEvent;

public class SampleGraphicEngine extends GraphicEngine<SampleEngineEvent> {
	private int i = 0;

	public SampleGraphicEngine(Game<SampleEngineEvent> parent) {
		super(parent);
		Log.debug("création du GraphicEngine");
	}

	public void frame() {
		this.i += 1;
		Log.debug("frame " + this.i + " du GraphicEngine");
		processQueue();
	}

	protected void processEvent(SampleEngineEvent event) {
	}
}