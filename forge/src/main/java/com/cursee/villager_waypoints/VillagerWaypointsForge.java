package com.cursee.villager_waypoints;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.villager_waypoints.core.common.registry.RegistryForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class VillagerWaypointsForge {
    
    public VillagerWaypointsForge() {
    
        VillagerWaypoints.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        VillagerWaypoints.debugCommon = MonoLibConfiguration.debugging;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryForge.register(modEventBus);
    }
}