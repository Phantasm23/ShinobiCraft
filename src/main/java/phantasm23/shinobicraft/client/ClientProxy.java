package phantasm23.shinobicraft.client;

import net.minecraft.client.renderer.entity.RenderSnowball;
import phantasm23.shinobicraft.common.CommonProxy;
import phantasm23.shinobicraft.common.ModItems;
import phantasm23.shinobicraft.common.entity.projectile.EntityShuriken;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityShuriken.class, new RenderSnowball(ModItems.shinobiShuriken));
	}

}
