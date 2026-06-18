package com.aethercull.mixin;

import com.aethercull.engine.AetherCullEngine;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Particle.class)
public class MixinParticle {
    @Inject(method = "buildGeometry", at = @At("HEAD"), cancellable = true)
    private void onBuildGeometry(VertexConsumer vertexConsumer, Camera camera, float tickDelta, CallbackInfo ci) {
        Particle particle = (Particle) (Object) this;
        if (!AetherCullEngine.INSTANCE.shouldRender(particle)) {
            ci.cancel();
        }
    }
}

