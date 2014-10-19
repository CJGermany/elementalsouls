package de.Laupetin.ElementalSouls.Event;

import java.util.LinkedList;
import java.util.List;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ServerTickEvent;
import cpw.mods.fml.relauncher.Side;
import de.Laupetin.ElementalSouls.ESRenderTickReceiver;
import net.minecraft.client.Minecraft;

public class ESEventHandler {

	private List<ESGameTickReceiver> gtr;
	
	public ESEventHandler(){
		gtr = new LinkedList<ESGameTickReceiver>();
	}
	
	@SubscribeEvent
	public void onClientTick(ClientTickEvent event){
		for(int i = 0; i < gtr.size(); i++){
			gtr.get(i).onGameTick(Side.CLIENT);
		}
	}
	
	@SubscribeEvent
	public void onServerTick(ServerTickEvent event){
		for(int i = 0; i < gtr.size(); i++){
			gtr.get(i).onGameTick(Side.SERVER);
		}
	}
	
	public void registerGameTickReceiver(ESGameTickReceiver g){
		if (g != null){
			gtr.add(g);
		}
	}
	
	public boolean isRegisteredGameTickReceiver(ESGameTickReceiver g){
		if (g != null){
			return gtr.contains(g);
		}
		return false;
	}
	
	public boolean removeGameTickReceiver(ESGameTickReceiver g){
		if (g != null){
			return gtr.remove(g);
		}
		return false;
	}
	
}
