package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.SoundEngine;
import yoan.game.engines.events.EngineEvent;

public class TestSoundEngine extends SoundEngine
{
  private int i = 0;

  public TestSoundEngine(Game parent)
  {
    super(parent);
    Log.debug("création du SoundEngine");
  }

  public void frame()
  {
    this.i += 1;
    Log.debug("frame " + this.i + " du SoundEngine");
    processQueue();
  }

  protected void processEvent(EngineEvent event)
  {
    Log.debug("SoundEngine emet le bruit : bip!");
  }
}
