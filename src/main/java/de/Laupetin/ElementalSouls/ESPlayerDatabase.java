package de.Laupetin.ElementalSouls;

import java.util.HashMap;
import java.util.Iterator;

import cpw.mods.fml.relauncher.Side;
import de.Laupetin.ElementalSouls.Event.ESEventHandler;
import de.Laupetin.ElementalSouls.Event.ESGameTickReceiver;
import de.Laupetin.ElementalSouls.Skills.ElementalSkill;
import net.minecraft.entity.player.EntityPlayer;

public class ESPlayerDatabase implements ESGameTickReceiver {

	private static ESPlayerDatabase instance;
	
	private HashMap<EntityPlayer,ESPlayerData> data;
	
	public ESPlayerDatabase(){
		if (instance == null){
			instance = this;
			data = new HashMap<EntityPlayer,ESPlayerData>();
			ElementalSouls.instance.proxy.getEventHandler().registerGameTickReceiver(this);
		}
	}
	
	public static ESPlayerDatabase instance(){
		if (instance == null){
			new ESPlayerDatabase();
		}
		return instance;
	}
	
	public ESPlayerData getPlayerData(EntityPlayer ep){
		if (ep != null){
			if (data.get(ep) == null){
				data.put(ep, new ESPlayerData(ep));
			}
			return data.get(ep);
		}
		return null;
	}

	@Override
	public void onGameTick(Side side) {
		if (data.isEmpty() == false){
			Iterator it = data.values().iterator();
			while(it.hasNext()){
				ESPlayerData d = (ESPlayerData)it.next();
				Iterator it2 = d.getActiveSkills().iterator();
				while(it2.hasNext()){
					((ElementalSkill)it2.next()).onSkillTick(d.getPlayer());
				}
			}
		}
	}
	
}
