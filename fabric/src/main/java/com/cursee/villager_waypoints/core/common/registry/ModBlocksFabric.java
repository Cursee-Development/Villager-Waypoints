package com.cursee.villager_waypoints.core.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocksFabric {

    public static void register() {}

    public static final Block VILLAGER_WAYPOINT = RegistryFabric.registerBlock("villager_waypoint", new Block(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
}
