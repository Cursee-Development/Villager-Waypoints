package com.cursee.villager_waypoints.core.client.entity.renderer;

import com.cursee.villager_waypoints.Constants;
import com.cursee.villager_waypoints.core.client.entity.model.WaypointVillagerModel;
import com.cursee.villager_waypoints.core.common.entity.WaypointVillager;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WaypointVillagerRenderer extends MobRenderer<WaypointVillager, WaypointVillagerModel<WaypointVillager>> {

    public static final ModelLayerLocation WAYPOINT_VILLAGER_RENDERER_LAYER = new ModelLayerLocation(new ResourceLocation(Constants.MOD_ID, "waypoint_villager"), "main");

    public WaypointVillagerRenderer(EntityRendererProvider.Context context) {
        super(context, new WaypointVillagerModel<>(context.bakeLayer(WAYPOINT_VILLAGER_RENDERER_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(WaypointVillager entity) {
        return new ResourceLocation(Constants.MOD_ID, "textures/entity/waypoint_villager.png");
    }
}
