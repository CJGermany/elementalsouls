package de.Laupetin.ElementalSouls.HUD;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ESRenderTickHandler {
	
	Minecraft mc;
	
	public ESRenderTickHandler(Minecraft mc){
		
		this.mc = mc;
	}

	@SubscribeEvent
	public void onRenderTick(RenderTickEvent event){
		
		
	}
	
}
