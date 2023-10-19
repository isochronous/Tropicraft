package net.tropicraft.core.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.tropicraft.core.common.entity.passive.SlenderHarvestMouseEntity;

public class SlenderHarvestMouseModel<T extends SlenderHarvestMouseEntity> extends TropicraftAgeableModel<T> {
    private final ModelPart body_base;
    private final ModelPart head;

    public SlenderHarvestMouseModel(ModelPart root) {
        this.body_base = root.getChild("body_base");
        this.head = body_base.getChild("head");
    }

    public static LayerDefinition create() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body_base = partdefinition.addOrReplaceChild("body_base", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 22.25F, 1.0F, -0.0873F, 0.0F, 0.0F));

        PartDefinition leg_front_right = body_base.addOrReplaceChild("leg_front_right", CubeListBuilder.create().texOffs(3, 11).addBox(-0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.0F, -1.5F));

        PartDefinition leg_front_left = body_base.addOrReplaceChild("leg_front_left", CubeListBuilder.create().texOffs(0, 11).addBox(-0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.0F, -1.5F));

        PartDefinition leg_back_right = body_base.addOrReplaceChild("leg_back_right", CubeListBuilder.create().texOffs(9, 11).addBox(-0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.5F, 0.2618F, 0.0F, 0.0F));

        PartDefinition leg_back_left = body_base.addOrReplaceChild("leg_back_left", CubeListBuilder.create().texOffs(6, 11).addBox(-0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, 0.5F, 0.2618F, 0.0F, 0.0F));

        PartDefinition head = body_base.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.5F, 0.3491F, 0.0F, 0.0F));

        PartDefinition wee_nose = head.addOrReplaceChild("wee_nose", CubeListBuilder.create().texOffs(12, 11).addBox(-0.5F, 0.25F, -0.02F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, -2.0F));

        PartDefinition cute_lil_ear_right = head.addOrReplaceChild("cute_lil_ear_right", CubeListBuilder.create().texOffs(10, 8).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.6545F, -0.9599F, 0.0F));

        PartDefinition cute_lil_ear_left = head.addOrReplaceChild("cute_lil_ear_left", CubeListBuilder.create().texOffs(7, 8).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.6545F, 0.9599F, 0.0F));

        PartDefinition tail1 = body_base.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.5F, -0.6981F, 0.0F, 0.0F));

        PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(7, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.3491F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body_base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    protected ModelPart getHead() {
        return head;
    }

    @Override
    protected ModelPart getBody() {
        return body_base;
    }
}