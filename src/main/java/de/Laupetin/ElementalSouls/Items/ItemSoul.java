package de.Laupetin.ElementalSouls.Items;

import java.util.Random;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import de.Laupetin.ElementalSouls.ESPlayerDatabase;
import de.Laupetin.ElementalSouls.ElementalSouls;
import de.Laupetin.ElementalSouls.Skills.ElementalSkillRegistry;
import de.Laupetin.ElementalSouls.Skills.Air.SkillFlying;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.transformers.ForgeAccessTransformer;

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
		
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT){
		
			if (r.nextInt(20) + 1 <= 3 && Minecraft.getMinecraft().thePlayer != null){
				switch (type){
			
				case 'f':
					Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, 1, 0, 0);
					break;
				
				case 'w':
					Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, -1, 0, 1);
					break;
				
				case 'e':
					Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, -1, 1, 0);
					break;
				
				case 'a':
					Minecraft.getMinecraft().thePlayer.worldObj.spawnParticle("reddust", entityItem.posX, entityItem.posY + 0.1, entityItem.posZ, 0, 1, 1);
					break;
				
				}
			
			}
		}
		return super.onEntityItemUpdate(entityItem);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_,
			EntityPlayer p_77659_3_) {
		ESPlayerDatabase.instance().getPlayerData(p_77659_3_).getActiveSkills().add(SkillFlying.skill());
		return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
	}
	
	
}
