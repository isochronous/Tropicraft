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
import net.minecraft.world.entity.Entity;

public class GibnutModel<T extends Entity> extends TropicraftAgeableModel<T> {
    private final ModelPart body_base;
    private final ModelPart head_base;

    public GibnutModel(ModelPart root) {
        this.body_base = root.getChild("body_base");
        this.head_base = body_base.getChild("head_base");
    }

    public static LayerDefinition create() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body_base = partdefinition.addOrReplaceChild("body_base", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 21.0F, 4.5F, 0.0436F, 0.0F, 0.0F));

        PartDefinition head_base = body_base.addOrReplaceChild("head_base", CubeListBuilder.create().texOffs(0, 13).addBox(-1.5F, -0.5F, -4.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -7.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition ear_right = head_base.addOrReplaceChild("ear_right", CubeListBuilder.create().texOffs(3, 31).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -0.75F, -0.0289F, 0.2163F, -0.3958F));

        PartDefinition ear_left = head_base.addOrReplaceChild("ear_left", CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5F, -0.75F, -0.0289F, -0.2163F, 0.3958F));

        PartDefinition whisker_right1 = head_base.addOrReplaceChild("whisker_right1", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.5F, -4.0F));

        PartDefinition whisker_right1_r1 = whisker_right1.addOrReplaceChild("whisker_right1_r1", CubeListBuilder.create().texOffs(27, 29).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.421F, 0.5574F, -0.3532F));

        PartDefinition whisker_right2 = head_base.addOrReplaceChild("whisker_right2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5F, 0.75F, -4.0F, 0.0F, 0.0F, -0.3054F));

        PartDefinition whisker_right2_r1 = whisker_right2.addOrReplaceChild("whisker_right2_r1", CubeListBuilder.create().texOffs(18, 29).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.421F, 0.5574F, -0.3532F));

        PartDefinition whisker_left1 = head_base.addOrReplaceChild("whisker_left1", CubeListBuilder.create(), PartPose.offset(-1.5F, 0.5F, -4.0F));

        PartDefinition whisker_left1_r1 = whisker_left1.addOrReplaceChild("whisker_left1_r1", CubeListBuilder.create().texOffs(9, 29).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.421F, -0.5574F, 0.3532F));

        PartDefinition whisker_left2 = head_base.addOrReplaceChild("whisker_left2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5F, 0.75F, -4.0F, 0.0F, 0.0F, 0.3054F));

        PartDefinition whisker_left2_r1 = whisker_left2.addOrReplaceChild("whisker_left2_r1", CubeListBuilder.create().texOffs(0, 29).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.421F, -0.5574F, 0.3532F));

        PartDefinition leg_back_left = body_base.addOrReplaceChild("leg_back_left", CubeListBuilder.create().texOffs(15, 13).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.5F, -0.5F, 0.0436F, 0.0F, 0.0F));

        PartDefinition leg_back_right = body_base.addOrReplaceChild("leg_back_right", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.5F, -0.5F, 0.0436F, 0.0F, 0.0F));

        PartDefinition leg_front_right = body_base.addOrReplaceChild("leg_front_right", CubeListBuilder.create().texOffs(14, 21).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.75F, -6.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition leg_front_left = body_base.addOrReplaceChild("leg_front_left", CubeListBuilder.create().texOffs(7, 21).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.75F, -6.0F, -0.1745F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
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
        return head_base;
    }

    @Override
    protected ModelPart getBody() {
        return body_base;
    }
}