package phantasm23.shinobicraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import phantasm23.shinobicraft.common.ShinobicraftMain;

public class BlockFirst extends Block {
	public BlockFirst(){
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.6F);
		this.setResistance(56.34F);
		this.setStepSound(this.soundTypeStone);
		this.setBlockName("myFirstBlock");
		
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		String str = ShinobicraftMain.MODID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1);
		System.out.println("%%% Block Icon = " + str);
		blockIcon = iconRegister.registerIcon(str);
	}
}
