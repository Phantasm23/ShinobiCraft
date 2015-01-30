package phantasm23.shinobicraft.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import phantasm23.shinobicraft.common.entity.projectile.EntityShuriken;

public class Shuriken extends BaseModItem {

	public Shuriken(){
		super();
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.maxStackSize = 32;
		this.setUnlocalizedName("shinobiShuriken");
	}
	
	
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --itemStack.stackSize;
        }

        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
        	
            world.spawnEntityInWorld(new EntityShuriken(world, player));
        }
        return itemStack;
    }

	
}
