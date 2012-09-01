package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.Engine;
import yoan.game.engines.GameEngine;
import yoan.game.engines.Module;
import yoan.game.engines.events.EngineEvent;
import yoan.sample.game.engines.events.TestEngineEvent;

public class SampleGameEngine extends GameEngine
{
  private int i = 0;

  public SampleGameEngine(Game parent) { super(parent);
    Log.debug("création du GameEngine");
  }

  public void frame()
  {
    this.i += 1;
    Log.debug("frame " + this.i + " du GameEngine");
    if (this.i == 50) {
      Log.debug("envoi d'un evenement au module sonore");
      ((Engine)this.game.getModules().get(Module.SOUND)).pushEvent(new TestEngineEvent("bip"));
    } else if (this.i == 100) {
      this.game.stop();
    }
    processQueue();
  }

  protected void processEvent(EngineEvent event)
  {
  }
}
