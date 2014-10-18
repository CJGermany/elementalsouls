package de.Laupetin.ElementalSouls.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorAir extends ElementalArmor {

	public ArmorAir(ArmorMaterial m, int i) {
		super(m, i);
		setMaxStackSize(1);
		
		switch (i){
		
		case 0:
			setUnlocalizedName("armor_helmet_air");
			setTextureName("ElementalSouls:Soul_Helmet_Air");
			break;
		case 1:
			setUnlocalizedName("armor_chestplate_air");
			setTextureName("ElementalSouls:Soul_Chestplate_Air");
			break;
		case 2:
			setUnlocalizedName("armor_leggings_air");
			setTextureName("ElementalSouls:Soul_Leggings_Air");
			break;
		case 3:
			setUnlocalizedName("armor_boots_air");
			setTextureName("ElementalSouls:Soul_Boots_Air");
			break;
		}
		
	}
	
	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if(slot == 0 || slot == 1 || slot == 3){return "ElementalSouls:textures/armor/airsoul_a_1.png";
		}else if(slot == 2 || slot == 3){ 
			return "ElementalSouls:textures/armor/airsoul_a_2.png";
		}
		return null;
	}


	@Override
	public String getElement() {
		return "air";
	}

}
