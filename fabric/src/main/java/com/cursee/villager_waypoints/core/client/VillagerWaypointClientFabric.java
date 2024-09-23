package com.cursee.villager_waypoints.core.client;

import com.cursee.villager_waypoints.core.client.entity.model.WaypointVillagerModel;
import com.cursee.villager_waypoints.core.client.entity.renderer.WaypointVillagerRenderer;
import com.cursee.villager_waypoints.core.common.registry.ModEntityTypesFabric;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class VillagerWaypointClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(WaypointVillagerRenderer.WAYPOINT_VILLAGER_RENDERER_LAYER, WaypointVillagerModel::createBodyLayer);
        EntityRendererRegistry.register(ModEntityTypesFabric.WAYPOINT_VILLAGER, WaypointVillagerRenderer::new);
    }
}
