package com.cursee.villager_waypoints.core.common.registry;

import com.cursee.villager_waypoints.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegistryForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Constants.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModBlocksForge.register();
        ModItemsForge.register();
        ModTabForge.register();
        ModBlockEntityTypesForge.register();
        ModEntityTypesForge.register();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        BLOCK_ENTITY_TYPES.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);
    }

    protected static <I extends Block, T extends I> RegistryObject<T> registerBlock(String blockID, Supplier<T> blockSupplier) {
        return BLOCKS.register(blockID, blockSupplier);
    }

    protected static <I extends Item, T extends I> RegistryObject<T> registerItem(String itemID, Supplier<T> item) {
        return ITEMS.register(itemID, item);
    }

    protected static <I extends Block, T extends I> RegistryObject<T> registerBlockAndBlockItem(String blockItemID, Supplier<T> block) {
        RegistryObject<T> toReturn = registerBlock(blockItemID, block);
        registerItem(blockItemID, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    protected static <I extends CreativeModeTab, T extends I> RegistryObject<T> registerCreativeModeTab(String tabID, Supplier<T> tab) {
        return CREATIVE_MODE_TABS.register(tabID, tab);
    }

    protected static <I extends BlockEntityType<?>, T extends I> RegistryObject<T> registerBlockEntityType(String blockEntityTypeID, Supplier<T> blockEntityType) {
        return BLOCK_ENTITY_TYPES.register(blockEntityTypeID, blockEntityType);
    }

    protected static <I extends EntityType<?>, T extends I> RegistryObject<T> registerEntityType(String entityTypeID, Supplier<T> entityType) {
        return ENTITY_TYPES.register(entityTypeID, entityType);
    }
}
