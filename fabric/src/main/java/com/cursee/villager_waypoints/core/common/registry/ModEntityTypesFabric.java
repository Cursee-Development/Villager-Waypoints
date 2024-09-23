package com.cursee.villager_waypoints.core.common.registry;

import com.cursee.villager_waypoints.core.common.entity.WaypointVillager;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypesFabric {

    public static void register() {}

    public static final EntityType<WaypointVillager> WAYPOINT_VILLAGER = RegistryFabric.registerEntityType("waypoint_villager", EntityType.Builder.of(WaypointVillager::new, MobCategory.MISC).build("waypoint_villager"));
}
