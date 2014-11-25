package de.Laupetin.ElementalSouls.Skills.Air;

import net.minecraft.entity.player.EntityPlayer;
import de.Laupetin.ElementalSouls.Skills.ElementalSkill;
import de.Laupetin.ElementalSouls.Skills.EnumElement;

public class SkillFlying extends ElementalSkill {
	
	public SkillFlying(){
		setUnlocalizedName("flying");
		registerSkill();
	}

	@Override
	public void onSkillActivated(EntityPlayer p) {
		
	}

	@Override
	public void onSkillTick(EntityPlayer p) {
		
	}

	@Override
	public void onSkillDeactivated(EntityPlayer p) {
		
	}

	@Override
	public EnumElement getElement() {
		return EnumElement.AIR;
	}

}
