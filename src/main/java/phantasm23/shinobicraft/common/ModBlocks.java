package phantasm23.shinobicraft.common;

import net.minecraft.block.Block;
import phantasm23.shinobicraft.common.blocks.BlockFirst;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {

	public static Block myFirstBlock;
	
	public static void init(){
		//Register Blocks
		myFirstBlock = new BlockFirst();
		LanguageRegistry.addName(myFirstBlock, "My old block");  //TODO: This needs to be fixed to use non-depreciated method.
		GameRegistry.registerBlock(myFirstBlock, myFirstBlock.getUnlocalizedName());

	}
}
