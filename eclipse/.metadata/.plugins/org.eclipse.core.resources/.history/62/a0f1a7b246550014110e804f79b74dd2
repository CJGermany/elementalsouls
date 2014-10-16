package de.Laupetin.ElementalSouls.Blocks.SoulBlocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public abstract class SoulBlock extends Block {

	public static Material soulMaterial = new Material (MapColor.quartzColor);
	
	
	protected SoulBlock() {
		super(soulMaterial);
		setResistance(10.0f);
		setHardness(5.0f);
		setStepSound(soundTypeMetal);
		setLightLevel(1f);
		setTickRandomly(true);
		setBlockTextureName("ElementalSouls:" + getUnlocalizedName().replaceFirst("tile.", ""));
	}
	
	@Override
	public abstract void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_,
			int p_149674_4_, Random p_149674_5_);
	
	

	
	
}
