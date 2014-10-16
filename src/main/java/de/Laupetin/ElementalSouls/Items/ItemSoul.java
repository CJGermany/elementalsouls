package de.Laupetin.ElementalSouls.Items;

import java.util.Random;

import de.Laupetin.ElementalSouls.ElementalSouls;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;

public class ItemSoul extends Item {
	
	private char type;

	public ItemSoul(char elementchar){
	
		setCreativeTab(ElementalSouls.tab);
		
		switch(elementchar){
		case 'f':
			setUnlocalizedName("Item_Soul_Fire");
			setTextureName("ElementalSouls:Soul_Fire");
			break;
			
		case 'w':
			setUnlocalizedName("Item_Soul_Water");
			setTextureName("ElementalSouls:Soul_Water");
			break;
			
		case 'e':
			setUnlocalizedName("Item_Soul_Earth");
			setTextureName("ElementalSouls:Soul_Earth");
			break;
			
		case 'a':
			setUnlocalizedName("Item_Soul_Air");
			setTextureName("ElementalSouls:Soul_Air");
			break;
			
		}
		
		type = elementchar;
	
	}
	
	@Override
	public boolean onEntityItemUpdate(EntityItem entityItem) {
		Random r = new Random();
		if (r.nextInt(20) + 1 <= 3){
			switch (type){
			
			case 'f':
				Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, 1, 0, 0);
				break;
				
			case 'w':
				Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, 0, 0, 1);
				break;
				
			case 'e':
				Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, 0, 1, 0);
				break;
				
			case 'a':
				Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, 1, 1, 1);
				break;
				
			}
			
		}
		return super.onEntityItemUpdate(entityItem);
	}
	
	
}
