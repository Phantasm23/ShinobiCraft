package phantasm23.shinobicraft.common;

import net.minecraft.item.Item;
import phantasm23.shinobicraft.common.items.Katana;
import phantasm23.shinobicraft.common.items.Kunai;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
	public static Item shinobiKunai;
	public static Item shinobiKatana;
	
	public static void init(){
		//Register Items.
		shinobiKunai = new Kunai();
		shinobiKatana = new Katana();
		
		LanguageRegistry.addName(shinobiKunai, "Kunai");  //TODO: Fix to use non-depreciated.
		LanguageRegistry.addName(shinobiKatana, "Katana");  //TODO: Fix to use non-depreciated.
		
		GameRegistry.registerItem(shinobiKunai, shinobiKunai.getUnlocalizedName());
		GameRegistry.registerItem(shinobiKatana, shinobiKatana.getUnlocalizedName());

	}
}
