package net.tropicraft.core.client.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.tropicraft.Constants;
import net.tropicraft.core.client.TropicraftRenderLayers;
import net.tropicraft.core.client.entity.model.ToucanModel;
import net.tropicraft.core.common.entity.passive.ToucanEntity;

public class ToucanRenderer extends MobRenderer<ToucanEntity, ToucanModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Constants.MODID, "textures/entity/toucan.png");

    public ToucanRenderer(final EntityRendererProvider.Context context) {
        super(context, new ToucanModel(context.bakeLayer(TropicraftRenderLayers.TOUCAN_LAYER)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ToucanEntity entity) {
        return TEXTURE;
    }
}