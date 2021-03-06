package de.Laupetin.ElementalSouls.Blocks.SoulBlocks;

import java.util.Random;

import de.Laupetin.ElementalSouls.ElementalSouls;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class SoulBlockAir extends SoulBlock {

	public SoulBlockAir(){
		super();
		this.setBlockName("Soul_Block_Air");
		setBlockTextureName("ElementalSouls:Soul_Block_Air");
	}
	
	@Override
	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_,
			int p_149674_4_, Random p_149674_5_) {
		
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World par1World, int par2, int par3,
			int par4, Random par5Random) {
		if (par5Random.nextInt(10) == 0){
			double d0 = (double)((float)par2 + par5Random.nextFloat());
			double d1 = (double)((float)par3 + par5Random.nextFloat());
			d0 = (double)((float)par4 + par5Random.nextFloat());
			double d2 = 0.0D;
			double d3 = 0.0D;
			double d4 = 0.0D;
			int i1 = par5Random.nextInt(2) * 2 - 1;
			int j1 = par5Random.nextInt(2) * 2 - 1;
			d2 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
			d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
			d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
			double d5 = (double)par4 + 0.5D + 0.25D * (double)j1;
			d4 = (double)(par5Random.nextFloat() * 1.0F * (float)j1);
			double d6 = (double)par2 + 0.5D + 0.25D * (double)i1;
			d2 = (double)(par5Random.nextFloat() * 1.0F * (float)i1);
        
			//if (par1World.getBlockId(par2,par3 + 1,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2,par3 - 1,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2 - 1,par3,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2 + 1,par3,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2,par3,par4 - 1) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2,par3,par4 + 1) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2 + 1,par3 + 1,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2 - 1,par3 + 1,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2 + 1,par3 - 1,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2 - 1,par3 - 1,par4) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2,par3 + 1,par4 + 1) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2,par3 + 1,par4 - 1) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2,par3 - 1,par4 + 1) != ElementalSouls.portalAir.blockID && par1World.getBlockId(par2,par3 - 1,par4 - 1) != ElementalSouls.portalAir.blockID){
				par1World.spawnParticle("cloud", d6, d1, d5, 0, 0.10D, 0);
			//}
		}
	}

}
