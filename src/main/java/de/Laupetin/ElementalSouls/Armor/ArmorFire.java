package de.Laupetin.ElementalSouls.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorFire extends ElementalArmor {

	public ArmorFire(ArmorMaterial m, int i) {
		super(m, i);
		setMaxStackSize(1);
		
		switch (i){
		
		case 0:
			setUnlocalizedName("armor_helmet_fire");
			setTextureName("ElementalSouls:Soul_Helmet_Fire");
			break;
		case 1:
			setUnlocalizedName("armor_chestplate_fire");
			setTextureName("ElementalSouls:Soul_Chestplate_Fire");
			break;
		case 2:
			setUnlocalizedName("armor_leggings_fire");
			setTextureName("ElementalSouls:Soul_Leggings_Fire");
			break;
		case 3:
			setUnlocalizedName("armor_boots_fire");
			setTextureName("ElementalSouls:Soul_Boots_Fire");
			break;
		}
		
	}
	
	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if(slot == 0 || slot == 1 || slot == 3){return "ElementalSouls:textures/armor/firesoul_a_1.png";
		}else if(slot == 2 || slot == 3){ 
			return "ElementalSouls:textures/armor/firesoul_a_2.png";
		}
		return null;
	}


	@Override
	public String getElement() {
		return "fire";
	}

}
