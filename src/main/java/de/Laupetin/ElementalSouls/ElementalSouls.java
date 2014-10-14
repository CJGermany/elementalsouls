package de.Laupetin.ElementalSouls;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
import de.Laupetin.ElementalSouls.Blocks.SoulBlocks.SoulBlock;
import de.Laupetin.ElementalSouls.Blocks.SoulBlocks.SoulBlockFire;
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
    
    
    
    
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	registerBlocks();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.registerRenderers();
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond,1), Blocks.dirt, Blocks.dirt);
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
    	
    }
    
    private void registerBlocks(){
    	
    	vSoulBlockFire = new SoulBlockFire();
    	GameRegistry.registerBlock(vSoulBlockFire, "SoulBlockFire");
    	
    	
    }
    
    private void registerItems(){
    	
    	
    	
    }
}
