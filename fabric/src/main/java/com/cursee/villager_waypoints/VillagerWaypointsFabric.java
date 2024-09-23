package com.cursee.villager_waypoints;

import com.cursee.monolib.core.MonoLibConfiguration;
import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.villager_waypoints.core.common.entity.WaypointVillager;
import com.cursee.villager_waypoints.core.common.registry.ModEntityTypesFabric;
import com.cursee.villager_waypoints.core.common.registry.RegistryFabric;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class VillagerWaypointsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        VillagerWaypoints.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        VillagerWaypoints.debugCommon = MonoLibConfiguration.debugging;

        RegistryFabric.register();

        FabricDefaultAttributeRegistry.register(ModEntityTypesFabric.WAYPOINT_VILLAGER, WaypointVillager.createAttributes());
    }
}
