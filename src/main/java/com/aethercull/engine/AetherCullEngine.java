package com.aethercull.engine;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.Entity;
import org.joml.Matrix4f;

public class AetherCullEngine {
    public static final AetherCullEngine INSTANCE = new AetherCullEngine();

    public void updateFrustum(Matrix4f combinedMatrix) {
        // Core tracking logic for optimization culling
    }

    public boolean shouldRender(Entity entity) {
        return true; 
    }

    public boolean shouldRender(BlockEntity blockEntity) {
        return true; 
    }

    public boolean shouldRender(Particle particle) {
        return true; 
    }
}

