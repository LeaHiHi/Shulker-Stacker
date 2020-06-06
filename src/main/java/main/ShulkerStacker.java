package main;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShulkerStacker implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "shulkerstaacker";
    public static final String MOD_NAME = "Shulker Stacker";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //Registry.ITEM.set(Registry.ITEM.getRawId(Items.SHULKER_BOX),Registry.ITEM_KEY, )

    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}