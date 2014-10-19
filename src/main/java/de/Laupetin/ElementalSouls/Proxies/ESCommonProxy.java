package de.Laupetin.ElementalSouls.Proxies;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import de.Laupetin.ElementalSouls.Event.ESEventHandler;
import de.Laupetin.ElementalSouls.Event.ESRenderTickHandler;

public class ESCommonProxy {

	private ESEventHandler eventhandler;
	
	public void registerRenderers()
	{
		
		
	}

	public void initialize() {
		eventhandler = new ESEventHandler();
		FMLCommonHandler.instance().bus().register(eventhandler);
	}

	public Side getSide() {
		return Side.SERVER;
	}

	public ESRenderTickHandler getRenderTickHandler() {
		
		return null;
	}
	
	public ESEventHandler getEventHandler(){
		return eventhandler;
	}
	
}
