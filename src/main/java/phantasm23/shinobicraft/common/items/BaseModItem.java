package phantasm23.shinobicraft.common.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import phantasm23.shinobicraft.common.ShinobicraftMain;

public class BaseModItem extends Item{
	
	public BaseModItem(){
		super();
	}
	
	/**
	 * Add the Texture, found in src/main/resources/assets/{ModId}/textures/items/{UnlocalizedName}.png
	 */
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(ShinobicraftMain.MODID
				+ ":"
				+ getUnlocalizedName().substring(
						getUnlocalizedName().indexOf(".") + 1));
	}

}
