package com.cursee.villager_waypoints;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import net.fabricmc.api.ModInitializer;

public class VillagerWaypointsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        VillagerWaypoints.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        VillagerWaypoints.debugCommon = MonoLibConfiguration.debugging;
    }
}
