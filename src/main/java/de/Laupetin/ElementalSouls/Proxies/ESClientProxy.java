package de.Laupetin.ElementalSouls.Proxies;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import de.Laupetin.ElementalSouls.Event.ESRenderTickHandler;

public class ESClientProxy extends ESCommonProxy {

	private ESRenderTickHandler renderTickHandler;
	
	@Override
	public void registerRenderers() 
	{
		
	}
	
	@Override
	public Side getSide(){
		
	return Side.CLIENT;
	}
	
	@Override
	public ESRenderTickHandler getRenderTickHandler(){
		return renderTickHandler;
	}
	
	
	@Override
	public void initialize(){
		super.initialize();
		renderTickHandler = new ESRenderTickHandler(Minecraft.getMinecraft());
		FMLCommonHandler.instance().bus().register(renderTickHandler);
	}
	
}
