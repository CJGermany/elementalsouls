package de.Laupetin.ElementalSouls;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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
    	
    	
    }
    
    private void registerRecipes(){
    	/**GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond,1), Blocks.dirt, Blocks.dirt);*/
    	
    
    }
}
