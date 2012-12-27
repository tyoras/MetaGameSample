package yoan.sample.game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import yoan.game.Game;
import yoan.game.engines.ModuleType;
import yoan.game.util.errors.GameException;
import yoan.sample.game.engines.SampleGameEngine;
import yoan.sample.game.engines.SampleGraphicEngine;
import yoan.sample.game.engines.SampleSoundEngine;
import yoan.sample.game.engines.events.SampleEngineEvent;

/**
 * Module principal gérant les autres modules du jeu
 * @author yoan
 */
public class SampleGame extends Game<SampleEngineEvent> {
	
	/**
	 * Initialisation des différents modules utilisés
	 */
	@Override
	public void init(String... initArgs) throws GameException {
		super.init(initArgs);
		
		//listage des modules utilisés
		modules.put(ModuleType.GAME, new SampleGameEngine(this));
		modules.put(ModuleType.GRAPHIC, new SampleGraphicEngine(this));
		modules.put(ModuleType.SOUND, new SampleSoundEngine(this));
		
		Map<ModuleType, String[]> args= new HashMap<ModuleType, String[]>();
		
		//les 2 premiers args sont ceux du GameEngine
		args.put(ModuleType.GAME, Arrays.copyOfRange(initArgs, 0, 2));
		initEngines(args);
	}

	/**
	 * Vérifie qu'il y a des arguments en entrée 
	 */
	@Override
	protected boolean checkInitArgs(String... initArgs){
		return initArgs != null;
	}
}