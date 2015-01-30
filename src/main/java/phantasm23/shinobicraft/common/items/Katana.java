package phantasm23.shinobicraft.common.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import phantasm23.shinobicraft.common.ShinobicraftMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Katana extends ItemSword {

	public Katana() {
		super(Item.ToolMaterial.EMERALD);
		this.setUnlocalizedName("shinobiKatana");
	}

	// @Override
	// public boolean hasEffect(ItemStack par1ItemStack) {
	// return true;
	// }

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(ShinobicraftMain.MODID
				+ ":"
				+ getUnlocalizedName().substring(
						getUnlocalizedName().indexOf(".") + 1));
	}

	// Override the default enchantability value to make it as enchantable as
	// Gold.
	@Override
	public int getItemEnchantability() {
		return Item.ToolMaterial.GOLD.getEnchantability();
	}
}
