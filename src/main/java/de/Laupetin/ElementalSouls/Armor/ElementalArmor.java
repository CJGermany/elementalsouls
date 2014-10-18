package de.Laupetin.ElementalSouls.Armor;

import de.Laupetin.ElementalSouls.ElementalSouls;
import net.minecraft.item.ItemArmor;

public abstract class ElementalArmor extends ItemArmor {

	//public static ArmorMaterial FIRESOULARMOR= .addArmorMaterial("FIRESOUL", 2, new int[]{4, 9, 7, 4}, 50); //DIAMOND{3, 8, 6, 3} 33
	
	public ElementalArmor(ArmorMaterial m, int i) {
		super(m, 0, i);
		setCreativeTab(ElementalSouls.tab);
	}

	public abstract String getElement();
	
	// Welche Ladung wird regeneriert?
	public int getBaseManaRegen(short amount){
		
	
		return 0;
	}
	
}
