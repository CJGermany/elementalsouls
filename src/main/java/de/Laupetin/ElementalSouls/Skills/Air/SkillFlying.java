package de.Laupetin.ElementalSouls.Skills.Air;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import de.Laupetin.ElementalSouls.Skills.ElementalSkill;
import de.Laupetin.ElementalSouls.Skills.EnumElement;

public class SkillFlying extends ElementalSkill {
	
	private static SkillFlying sskill;
	
	public static SkillFlying skill(){
		if (sskill == null){
			sskill = new SkillFlying();
		}
		return sskill;
	}
	
	public SkillFlying(){
		setUnlocalizedName("flying");
		registerSkill();
	}

	@Override
	public void onSkillActivated(EntityPlayer p) {
		
	}

	@Override
	public void onSkillTick(EntityPlayer p) {
		if (p != null){
			System.out.println(p.fallDistance);
			p.fallDistance = 0.0f;
			
			if (p.capabilities.isFlying == false && p.getEntityWorld().getBlock(((Double)p.posX).intValue(), ((Double)p.posY).intValue() - 1, ((Double)p.posZ).intValue()).getMaterial() != Material.water && p.getEntityWorld().getBlock(((Double)p.posX).intValue(), ((Double)p.posY).intValue() - 1, ((Double)p.posZ).intValue()).getMaterial() != Material.lava){
				double vx,vz, vy;
				vx =  Math.sin(((p.rotationYaw % 360) / 360) * 2 * Math.PI) != 0 ? -(Math.sin(((p.rotationYaw % 360) / 360) * 2 * Math.PI)) : -(Math.sin(1 / 360) * 2 * Math.PI);
				vz = Math.cos(((p.rotationYaw % 360) / 360) * 2 * Math.PI) != 0 ? Math.cos(((p.rotationYaw % 360) / 360) * 2 * Math.PI) : Math.cos(360 / 360) * 2 * Math.PI;
				vy = Math.cos(((p.rotationPitch + 90) / 360) * 2 * Math.PI);
				vx *= (Math.sin(((p.rotationPitch + 90) / 360) * 2 * Math.PI));
				vz *= (Math.sin(((p.rotationPitch + 90) / 360) * 2 * Math.PI));

				p.setVelocity(vx * 0.6 , vy, vz * 0.6);
				p.velocityChanged = true;
			}
		}
	}

	@Override
	public void onSkillDeactivated(EntityPlayer p) {
		
	}

	@Override
	public EnumElement getElement() {
		return EnumElement.AIR;
	}

}
