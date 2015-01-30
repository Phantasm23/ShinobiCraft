package phantasm23.shinobicraft.common;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import phantasm23.shinobicraft.common.handlers.FuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Phantasm23
 * 
 */
@Mod(modid = ShinobicraftMain.MODID, name = ShinobicraftMain.MODNAME, version = ShinobicraftMain.MODVERSION)
// @NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ShinobicraftMain {
	public static final String MODID = "ShinobiCraft";
	public static final String MODNAME = "ShinobiCraft";
	public static final String MODVERSION = "99.99.99 Pre-Beta Stupid";

	@Instance(ShinobicraftMain.MODNAME)
	public static ShinobicraftMain instance;

	@SidedProxy(clientSide = "phantasm23.shinobicraft.client.ClientProxy", serverSide = "phantasm23.shinobicraft.common.CommonProxy")
	public static CommonProxy proxy;

	public static Boolean isModEnabled = true; 
	public static Boolean isDebugEnabled = true; 

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Load the config settings.
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		Property prop = null; 
		prop = config.get("Testing", "DebuggingEnabled", true, "Setting this to false will disable all debugging messages.");
		isDebugEnabled = prop.getBoolean(true);
		prop = config.get("Testing", "EnableMod", true, "Setting this to false will disable all modded features.");
		isModEnabled = prop.getBoolean(true);
		
		//re-save the config settings.
		config.save();
		
		ShinobicraftMain.debug("isDebuggingEnabled=" + isDebugEnabled);
		ShinobicraftMain.debug("isModEnabled=" + isModEnabled);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		if (!this.isModEnabled)
			return;

		ModBlocks.init();
		ModItems.init();
		
		//Fuel Handler
		GameRegistry.registerFuelHandler(new FuelHandler());
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}

	public static void debug(String output){
		if (ShinobicraftMain.isDebugEnabled){
			System.out.println("%^%: " + output);
		}
	}
	
}
