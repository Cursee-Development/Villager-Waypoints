package com.cursee.villager_waypoints.mixin;

import com.cursee.villager_waypoints.Constants;
import com.cursee.villager_waypoints.platform.Services;
import com.cursee.monolib.core.MonoLibConfiguration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FabricTitleScreenMixin {
    
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {

        if (MonoLibConfiguration.debugging) {
            Constants.LOG.info("This line is printed by a mixin loaded in a {} instance!", Services.PLATFORM.getPlatformName());
            Constants.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
        }
    }
}