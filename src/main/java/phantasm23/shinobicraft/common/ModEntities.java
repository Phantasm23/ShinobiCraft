package phantasm23.shinobicraft.common;

import phantasm23.shinobicraft.common.entity.projectile.EntityShuriken;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities {

	public static void init(){
		int modEntityID = 0;

		EntityRegistry.registerModEntity(EntityShuriken.class, "Shuriken", ++modEntityID, ShinobicraftMain.instance, 64, 15, true);
	}
}
