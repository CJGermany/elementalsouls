package de.Laupetin.ElementalSouls.Blocks.SoulBlocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class SoulBlockFire extends SoulBlock {

	public SoulBlockFire(){
		super();
		this.setBlockName("Soul_Block_Fire");
		setBlockTextureName("ElementalSouls:Soul_Block_Fire");
	}

	@Override
	public void updateTick(World w, int i1, int i2,
			int i3, Random r) {
		
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World par1World, int xk, int yk,
			int zk, Random par5Random) {
		if (par5Random.nextInt(10) == 0){
			double d0 = (double)((float)xk + par5Random.nextFloat());
			double d1 = (double)((float)yk + par5Random.nextFloat());
			d0 = (double)((float)zk + par5Random.nextFloat());
			double d2 = 0.0D;
			double d3 = 0.0D;
			double d4 = 0.0D;
			int i1 = par5Random.nextInt(2) * 2 - 1;
			int j1 = par5Random.nextInt(2) * 2 - 1;
			d2 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
			d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
			d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.125D;
			double d5 = (double)zk + 0.5D + 0.25D * (double)j1;
			d4 = (double)(par5Random.nextFloat() * 1.0F * (float)j1);
			double d6 = (double)xk + 0.5D + 0.25D * (double)i1;
			d2 = (double)(par5Random.nextFloat() * 1.0F * (float)i1);
			//par1World.spawnParticle("portal", d6, d1, d5, d2, d3, d4);
			/**if (par1World.getBlockId(xk,yk + 1,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk,yk - 1,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk - 1,yk,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk + 1,yk,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk,yk,zk - 1) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk,yk,zk + 1) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk + 1,yk + 1,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk - 1,yk + 1,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk + 1,yk - 1,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk - 1,yk - 1,zk) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk,yk + 1,zk + 1) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk,yk + 1,zk - 1) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk,yk - 1,zk + 1) != ElementalSouls.portalFire.blockID && par1World.getBlockId(xk,yk - 1,zk - 1) != ElementalSouls.portalFire.blockID){
            */
        
			par1World.spawnParticle("lava", d6, d1, d5, 0, 0.25f, 0);
        
			/**
    		}
    		
    		*/
		}
		
	}
	
	

}
