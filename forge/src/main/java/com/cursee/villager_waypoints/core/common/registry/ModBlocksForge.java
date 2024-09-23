package com.cursee.villager_waypoints.core.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocksForge {

    public static void register() {}

    public static final RegistryObject<Block> VILLAGER_WAYPOINT = RegistryForge.registerBlock("villager_waypoint", () -> new Block(BlockBehaviour.Properties.of()));
}
