package yoan.sample.game.engines;

import yoan.game.Game;
import yoan.game.Log;
import yoan.game.engines.GraphicEngine;
import yoan.game.engines.events.EngineEvent;

public class TestGraphicEngine extends GraphicEngine
{
  private int i = 0;

  public TestGraphicEngine(Game parent)
  {
    super(parent);
    Log.debug("création du GraphicEngine");
  }

  public void frame()
  {
    this.i += 1;
    Log.debug("frame " + this.i + " du GraphicEngine");
    processQueue();
  }

  protected void processEvent(EngineEvent event)
  {
  }
}