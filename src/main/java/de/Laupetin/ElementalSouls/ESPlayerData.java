package de.Laupetin.ElementalSouls;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import de.Laupetin.ElementalSouls.Skills.*;

public class ESPlayerData {

	private EnumElement selectedElement;
	private List<ElementalSkill> activeSkills;
	private EntityPlayer p;
	
	public ESPlayerData (EntityPlayer pneu){
		if (pneu == null){
			throw new NullPointerException();
		}
		p = pneu;
		activeSkills = new LinkedList<ElementalSkill>();
	}
	
	public EnumElement getSelectedElement(){
		return selectedElement;
	}
	
	public void setSelectedElement(EnumElement el){
		selectedElement = el;
	}
	
	public List<ElementalSkill> getActiveSkills(){
		return activeSkills;
	}
	
	public EntityPlayer getPlayer(){
		return p;
	}
}
