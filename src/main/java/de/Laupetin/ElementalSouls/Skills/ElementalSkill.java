package de.Laupetin.ElementalSouls.Skills;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import de.Laupetin.ElementalSouls.Event.ESGameTickReceiver;
import net.minecraft.entity.player.EntityPlayer;

public abstract class ElementalSkill {
	
	private String unlocalizedName;
	
	public abstract void onSkillActivated(EntityPlayer p);
	
	public abstract void onSkillTick(EntityPlayer p);
	
	public abstract void onSkillDeactivated(EntityPlayer p);
	
	public abstract EnumElement getElement();
	
	public void setUnlocalizedName(String s){unlocalizedName = s;}
	
	public String getUnlocalizedName(){return unlocalizedName;}
	
	public String getSkillName(){
		return LanguageRegistry.instance().getStringLocalization("skill." + unlocalizedName + ".name");
	}
	
	public void registerSkill(){	
		ElementalSkillRegistry.instance().registerSkill(this);
	}
	
	public boolean isValid(){
		if (unlocalizedName != "" && getElement() != null) {return false;} else {return true;}
	}
	
	public String getImagePath(){
		return "textures/hud/skills/" + getElement().toString() + "/" + getUnlocalizedName();
	}

	
}
