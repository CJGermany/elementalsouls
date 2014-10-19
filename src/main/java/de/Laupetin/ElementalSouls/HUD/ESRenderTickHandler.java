package de.Laupetin.ElementalSouls.HUD;

import java.util.*;

import net.minecraft.client.Minecraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ESRenderTickHandler {
	
	private List<ESRenderTickReceiver> rtr;
	Minecraft mc;
	
	public ESRenderTickHandler(Minecraft mc){
		
		this.mc = mc;
		rtr = new LinkedList<ESRenderTickReceiver>();
	}

	@SubscribeEvent
	public void onRenderTick(RenderTickEvent event){
		for(int i = 0; i < rtr.size(); i++){
				rtr.get(i).onRenderTick();
		}
	}
	
	public void registerRenderTickReceiver(ESRenderTickReceiver r){
		if (r != null){
			rtr.add(r);
		}
	}
	
	public boolean isRegisteredRenderTickReceiver(ESRenderTickReceiver r){
		if (r != null){
			return rtr.contains(r);
		}
		return false;
	}
	
	public boolean removeRenderTickReceiver(ESRenderTickReceiver r){
		if (r != null){
			return rtr.remove(r);
		}
		return false;
	}
	
}
