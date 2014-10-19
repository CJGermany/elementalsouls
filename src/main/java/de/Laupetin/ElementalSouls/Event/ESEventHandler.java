package de.Laupetin.ElementalSouls.Event;

import java.util.LinkedList;
import java.util.List;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ServerTickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

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
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event){
		System.out.println("PlayerTick");
		boolean waterWalk = false;	// Ist WaterWalk im Moment aktiviert?
		double waterMana = 100;	// wie viel Wasserladung hat der Spieler aktuell?
		double ticksPerSecond = 20;	// Wie kann man die sonst abfragen? Bei overload sind die ja nicht immer ganz stabil...
		double waterWalkManaConsumption = 10/ticksPerSecond;	// Manaverbrauch pro Sekunde (Ist ja variabel je nach Rüstung und Skills...)
		
		// waterWalk = p.getAbilities("waterWalk").isEnabled();	//Wir brauchen ein system, um einfach solche abfragen machen zu können.
		// waterMana = p.getMana("water");	// Muss alles nicht unbedingt genau so aussehen, aber so ist es denk ich mal plausibel und einfach aufgebaut.
		// waterWalkManaConsumption = p.getAbilities("waterWalk").getConsumptionRate();
		
		if (waterWalk && (waterMana > waterWalkManaConsumption)) {
			// Hier kann man auf dem Wasser laufen.
			World world = event.player.worldObj;
			
			int x = MathHelper.floor_double(event.player.posX);
			int y = MathHelper.floor_double(event.player.boundingBox.minY - 1);
			int z = MathHelper.floor_double(event.player.posZ);
			
			Material maybeWater = world.getBlock(x, y, z).getMaterial();
			
			boolean water = (maybeWater == Material.water);
			
			if (water && (event.player.motionY < 0.0D)) {
				event.player.posY += -event.player.motionY;
				event.player.motionY = 0.0D;
				event.player.fallDistance = 0.0F;
				// player.setMana("water", waterMana-(waterWalkManaConsumption/ticksPerSecond))
			}
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
