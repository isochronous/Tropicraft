package net.tropicraft.core.client.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tropicraft.Constants;
import net.tropicraft.core.client.TropicraftRenderLayers;
import net.tropicraft.core.client.entity.model.HummingbirdModel;
import net.tropicraft.core.client.entity.model.KeelBilledToucanModel;
import net.tropicraft.core.common.entity.passive.HummingbirdEntity;
import net.tropicraft.core.common.entity.passive.ToucanEntity;

public class KeelBilledToucanRenderer extends MobRenderer<ToucanEntity, KeelBilledToucanModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Constants.MODID, "textures/entity/keel_billed_toucan.png");

    public KeelBilledToucanRenderer(final EntityRendererProvider.Context context) {
        super(context, new KeelBilledToucanModel(context.bakeLayer(TropicraftRenderLayers.KEEL_BILLED_TOUCAN_LAYER)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ToucanEntity entity) {
        return TEXTURE;
    }
}
