package de.Laupetin.ElementalSouls.HUD;

import cpw.mods.fml.relauncher.Side;
import de.Laupetin.ElementalSouls.*;
import de.Laupetin.ElementalSouls.Event.ESRenderTickReceiver;

public abstract class ESHUD implements ESRenderTickReceiver{
	
	public static ESHUD skillbar = new hudskillbar();
	
	public abstract void render();
	
	public abstract boolean shouldRender();
	
	public void onRenderTick(){
		if (shouldRender()){
			render();
		}
	}
	
	public static void registerHUDs(){
		if (ElementalSouls.proxy.getSide() == Side.CLIENT){
			ElementalSouls.proxy.getRenderTickHandler().registerRenderTickReceiver(skillbar);
			
		}
	}
	
}
