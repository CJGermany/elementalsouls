package de.Laupetin.ElementalSouls.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorEarth extends ElementalArmor {

	public ArmorEarth(ArmorMaterial m, int i) {
		super(m, i);
		setMaxStackSize(1);
		
		switch (i){
		
		case 0:
			setUnlocalizedName("armor_helmet_earth");
			setTextureName("ElementalSouls:Soul_Helmet_Earth");
			break;
		case 1:
			setUnlocalizedName("armor_chestplate_earth");
			setTextureName("ElementalSouls:Soul_Chestplate_Earth");
			break;
		case 2:
			setUnlocalizedName("armor_leggings_earth");
			setTextureName("ElementalSouls:Soul_Leggings_Earth");
			break;
		case 3:
			setUnlocalizedName("armor_boots_earth");
			setTextureName("ElementalSouls:Soul_Boots_Earth");
			break;
		}
		
	}
	
	
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if(slot == 0 || slot == 1 || slot == 3){return "ElementalSouls:textures/armor/earthsoul_a_1.png";
		}else if(slot == 2 || slot == 3){ 
			return "ElementalSouls:textures/armor/earthsoul_a_2.png";
		}
		return null;
	}


	@Override
	public String getElement() {
		return "earth";
	}

}
