package de.Laupetin.ElementalSouls;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
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
    
    
    
    /**
     
	ANDERER SHIT

     */
    public static CreativeTabs tab;
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	tab = new CreativeTabs("tabElementalSouls") {
			@Override
			public Item getTabIconItem() {
				return vSoulFire;
			}
		};
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

		vArmorHelmetFire = new Armor_Fire(ArmorMaterial.DIAMOND,0);
		GameRegistry.registerItem(vArmorHelmetFire, "ES_Armor_Helmet_Fire");
		vArmorChestplateFire = new Armor_Fire(ArmorMaterial.DIAMOND,1);
		GameRegistry.registerItem(vArmorChestplateFire, "ES_Armor_Chestplate_Fire");
		vArmorLeggingsFire = new Armor_Fire(ArmorMaterial.DIAMOND,2);
		GameRegistry.registerItem(vArmorLeggingsFire, "ES_Armor_Leggings_Fire");
		vArmorBootsFire = new Armor_Fire(ArmorMaterial.DIAMOND,3);
		GameRegistry.registerItem(vArmorBootsFire, "ES_Armor_Boots_Fire");
    	
    	
    }
    
    private void registerRecipes(){
    	/**GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond,1), Blocks.dirt, Blocks.dirt);*/
    
    }
}
