package com.cursee.villager_waypoints.core.common.registry;

import com.cursee.villager_waypoints.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class RegistryFabric {

    public static void register() {

        ModBlocksFabric.register();
        ModItemsFabric.register();
        ModTabFabric.register();
        ModBlockEntityTypesFabric.register();
        ModEntityTypesFabric.register();
    }

    protected static <I extends Block, T extends I> T registerBlock(String id, T block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, id), block);
    }

    protected static <I extends Item, T extends I> T registerItem(String id, T item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, id), item);
    }

    protected static <I extends Block, T extends I> T registerBlockAndBlockItem(String blockItemID, T block) {
        T toReturn = registerBlock(blockItemID, block);
        registerItem(blockItemID, new BlockItem(toReturn, new Item.Properties()));
        return toReturn;
    }

    protected static <I extends CreativeModeTab, T extends I> T registerCreativeModeTab(String id, T tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, id), tab);
    }

    protected static <I extends BlockEntityType<?>, T extends I> T registerBlockEntityType(String id, T blockEntityType) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, id), blockEntityType);
    }

    protected static <I extends EntityType<?>, T extends I> T registerEntityType(String id, T entityType) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(Constants.MOD_ID, id), entityType);
    }
}
