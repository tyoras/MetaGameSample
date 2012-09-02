package yoan.sample.game.engines.events;

import yoan.game.engines.events.EngineEvent;

public class SampleEngineEvent extends EngineEvent {
	private String data;

	public SampleEngineEvent(String data) {
		setData(data);
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}
}