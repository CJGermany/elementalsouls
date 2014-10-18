package de.Laupetin.ElementalSouls;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import de.Laupetin.ElementalSouls.Armor.*;
import de.Laupetin.ElementalSouls.Blocks.SoulBlocks.*;
import de.Laupetin.ElementalSouls.Items.*;
import de.Laupetin.ElementalSouls.Proxies.ESCommonProxy;

@Mod(modid = ElementalSouls.MODID, version = ElementalSouls.VERSION)
public class ElementalSouls
{
    public static final String MODID = "ElementalSoulsMod";
    public static final String VERSION = "0.0.1";
    
    @Instance(value="ElementalSoulsMod")
    public static ElementalSouls instance;
    
    @SidedProxy(clientSide = "de.Laupetin.ElementalSouls.Proxies.ESClientProxy", serverSide = "de.Laupetin.ElementalSouls.Proxies.ESCommonProxy")
    public static ESCommonProxy proxy;
    
    /**
     
     BLOCKS
     
     */
    public static SoulBlock vSoulBlockFire;
    public static SoulBlock vSoulBlockWater;
    public static SoulBlock vSoulBlockEarth;
    public static SoulBlock vSoulBlockAir;
    
    /**
     
     ITEMS 
      
     */
    public static ItemSoul vSoulFire;
    public static ItemSoul vSoulWater;
    public static ItemSoul vSoulEarth;
    public static ItemSoul vSoulAir;

    public static ElementalArmor vArmorHelmetFire;
    public static ElementalArmor vArmorChestplateFire;
    public static ElementalArmor vArmorLeggingsFire;
    public static ElementalArmor vArmorBootsFire;
    
    public static ElementalArmor vArmorHelmetWater;
    public static ElementalArmor vArmorChestplateWater;
    public static ElementalArmor vArmorLeggingsWater;
    public static ElementalArmor vArmorBootsWater;
    
    public static ElementalArmor vArmorHelmetEarth;
    public static ElementalArmor vArmorChestplateEarth;
    public static ElementalArmor vArmorLeggingsEarth;
    public static ElementalArmor vArmorBootsEarth;
    
    public static ElementalArmor vArmorHelmetAir;
    public static ElementalArmor vArmorChestplateAir;
    public static ElementalArmor vArmorLeggingsAir;
    public static ElementalArmor vArmorBootsAir;
    
    /**
     
	ANDERER SHIT

     */
    public static CreativeTabs tab;
    private static EnumHelper enumhelp;
    public static ArmorMaterial armorMaterialSoul;
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	tab = new CreativeTabs("tabElementalSouls") {
			@Override
			public Item getTabIconItem() {
				return vSoulFire;
			}
		};
		
		enumhelp = new EnumHelper();
		armorMaterialSoul = enumhelp.addArmorMaterial("SOUL", 50, new int[]{2, 6, 5, 2}, 80); //DIAMOND{3, 8, 6, 3} 33
		
		registerItems();
		registerBlocks();
		 
		 
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.registerRenderers();
		registerRecipes();
		
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
    	
    }
    
    private void registerBlocks(){
    	
    	vSoulBlockFire = new SoulBlockFire();
    	GameRegistry.registerBlock(vSoulBlockFire, "SoulBlockFire");
    	vSoulBlockWater = new SoulBlockWater();
    	GameRegistry.registerBlock(vSoulBlockWater, "SoulBlockWater");
    	vSoulBlockEarth = new SoulBlockEarth();
    	GameRegistry.registerBlock(vSoulBlockEarth, "SoulBlockEarth");
    	vSoulBlockAir = new SoulBlockAir();
    	GameRegistry.registerBlock(vSoulBlockAir, "SoulBlockAir");
    	
    	
    }
    
    private void registerItems(){
		vSoulFire = new ItemSoul('f');
		GameRegistry.registerItem(vSoulFire, "SoulFire");
		vSoulWater = new ItemSoul('w');
		GameRegistry.registerItem(vSoulWater, "SoulWater");
		vSoulEarth = new ItemSoul('e');
		GameRegistry.registerItem(vSoulEarth, "SoulEarth");
		vSoulAir = new ItemSoul('a');
		GameRegistry.registerItem(vSoulAir, "SoulAir");

		vArmorHelmetFire = new ArmorFire(armorMaterialSoul,0);
		GameRegistry.registerItem(vArmorHelmetFire, "ES_Armor_Helmet_Fire");
		vArmorChestplateFire = new ArmorFire(armorMaterialSoul,1);
		GameRegistry.registerItem(vArmorChestplateFire, "ES_Armor_Chestplate_Fire");
		vArmorLeggingsFire = new ArmorFire(armorMaterialSoul,2);
		GameRegistry.registerItem(vArmorLeggingsFire, "ES_Armor_Leggings_Fire");
		vArmorBootsFire = new ArmorFire(armorMaterialSoul,3);
		GameRegistry.registerItem(vArmorBootsFire, "ES_Armor_Boots_Fire");
		
		vArmorHelmetWater = new ArmorWater(armorMaterialSoul,0);
		GameRegistry.registerItem(vArmorHelmetWater, "ES_Armor_Helmet_Water");
		vArmorChestplateWater = new ArmorWater(armorMaterialSoul,1);
		GameRegistry.registerItem(vArmorChestplateWater, "ES_Armor_Chestplate_Water");
		vArmorLeggingsWater = new ArmorWater(armorMaterialSoul,2);
		GameRegistry.registerItem(vArmorLeggingsWater, "ES_Armor_Leggings_Water");
		vArmorBootsWater = new ArmorWater(armorMaterialSoul,3);
		GameRegistry.registerItem(vArmorBootsWater, "ES_Armor_Boots_Water");
		
		vArmorHelmetAir = new ArmorAir(armorMaterialSoul,0);
		GameRegistry.registerItem(vArmorHelmetAir, "ES_Armor_Helmet_Air");
		vArmorChestplateAir = new ArmorAir(armorMaterialSoul,1);
		GameRegistry.registerItem(vArmorChestplateAir, "ES_Armor_Chestplate_Air");
		vArmorLeggingsAir = new ArmorAir(armorMaterialSoul,2);
		GameRegistry.registerItem(vArmorLeggingsAir, "ES_Armor_Leggings_Air");
		vArmorBootsAir = new ArmorAir(armorMaterialSoul,3);
		GameRegistry.registerItem(vArmorBootsAir, "ES_Armor_Boots_Air");
		
		vArmorHelmetEarth = new ArmorEarth(armorMaterialSoul,0);
		GameRegistry.registerItem(vArmorHelmetEarth, "ES_Armor_Helmet_Earth");
		vArmorChestplateEarth = new ArmorEarth(armorMaterialSoul,1);
		GameRegistry.registerItem(vArmorChestplateEarth, "ES_Armor_Chestplate_Earth");
		vArmorLeggingsEarth = new ArmorEarth(armorMaterialSoul,2);
		GameRegistry.registerItem(vArmorLeggingsEarth, "ES_Armor_Leggings_Earth");
		vArmorBootsEarth = new ArmorEarth(armorMaterialSoul,3);
		GameRegistry.registerItem(vArmorBootsEarth, "ES_Armor_Boots_Earth");
    	
    	
    }
    
    private void registerRecipes(){
    	//GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond,1), Blocks.dirt, Blocks.dirt);
    
    }
}
