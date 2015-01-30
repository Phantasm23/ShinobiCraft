package phantasm23.shinobicraft.common.handlers;

import net.minecraft.item.ItemStack;
import phantasm23.shinobicraft.common.ModItems;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		String str = fuel.getUnlocalizedName();
		if (str.equals(ModItems.shinobiKunai.getUnlocalizedName())){
			return 3200;
		}		
		return 0;
	}

}
