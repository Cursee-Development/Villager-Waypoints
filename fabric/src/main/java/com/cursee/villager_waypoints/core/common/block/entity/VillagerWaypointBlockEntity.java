package com.cursee.villager_waypoints.core.common.block.entity;

import com.cursee.villager_waypoints.core.common.registry.ModBlockEntityTypesFabric;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class VillagerWaypointBlockEntity extends BlockEntity {

    public VillagerWaypointBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntityTypesFabric.VILLAGER_WAYPOINT, blockPos, blockState);
    }
}
