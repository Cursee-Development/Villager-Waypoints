package com.cursee.villager_waypoints.core.common.registry;

import com.cursee.villager_waypoints.core.common.block.entity.VillagerWaypointBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntityTypesFabric {

    public static void register() {}

    public static final BlockEntityType<VillagerWaypointBlockEntity> VILLAGER_WAYPOINT = RegistryFabric.registerBlockEntityType("villager_waypoint", BlockEntityType.Builder.of(VillagerWaypointBlockEntity::new, ModBlocksFabric.VILLAGER_WAYPOINT).build(null));
}
