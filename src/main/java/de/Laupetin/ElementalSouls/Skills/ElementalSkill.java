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
	
	public String getSkillName(){return LanguageRegistry.instance().getStringLocalization("skill." + unlocalizedName + ".name");}

}
