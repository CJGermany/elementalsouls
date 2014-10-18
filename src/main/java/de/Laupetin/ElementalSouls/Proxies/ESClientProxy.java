package de.Laupetin.ElementalSouls.Proxies;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.FMLCommonHandler;
import de.Laupetin.ElementalSouls.HUD.ESRenderTickHandler;

public class ESClientProxy extends ESCommonProxy {

	@Override
	public void registerRenderers() 
	{
		
	}
	
	
	@Override
	public void initialize(){
		super.initialize();
		FMLCommonHandler.instance().bus().register(new ESRenderTickHandler(Minecraft.getMinecraft()));
	}
	
}
