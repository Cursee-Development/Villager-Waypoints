package com.cursee.villager_waypoints.core.common.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabFabric {

    public static void register() {}

    public static final CreativeModeTab VILLAGER_WAYPOINTS_TAB = RegistryFabric.registerCreativeModeTab("villager_waypoints_tab", FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.villagerWaypoints"))
            .icon(() -> new ItemStack(ModBlocksFabric.VILLAGER_WAYPOINT))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModBlocksFabric.VILLAGER_WAYPOINT);
            }).build());
}
