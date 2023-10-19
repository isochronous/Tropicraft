package net.tropicraft.core.client.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.tropicraft.core.common.entity.underdasea.ManateeEntity;

public class ManateeModel extends HierarchicalModel<ManateeEntity> {
    private final ModelPart body_base;
    private final ModelPart bb_main;
    private final ModelPart root;

    public ManateeModel(ModelPart root) {
        this.root = root;
        this.body_base = root.getChild("body_base");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition create() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body_base = partdefinition.addOrReplaceChild("body_base", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -3.0F, -30.0F, 18.0F, 14.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 11.0F, 11.0F));

        PartDefinition head_base = body_base.addOrReplaceChild("head_base", CubeListBuilder.create().texOffs(43, 66).addBox(-5.0F, 0.0F, -7.0F, 10.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -30.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition mouth = head_base.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(78, 66).addBox(-4.0F, 0.0F, -6.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -7.0F, 0.6109F, 0.0F, 0.0F));

        PartDefinition tail_base = body_base.addOrReplaceChild("tail_base", CubeListBuilder.create().texOffs(57, 46).addBox(-6.0F, 0.0F, 0.0F, 12.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 1.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition tail_fan_main = tail_base.addOrReplaceChild("tail_fan_main", CubeListBuilder.create().texOffs(0, 66).addBox(-7.0F, -2.0F, -4.0F, 14.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 7.0F));

        PartDefinition tail_fan_broad = tail_fan_main.addOrReplaceChild("tail_fan_broad", CubeListBuilder.create().texOffs(0, 46).addBox(-9.0F, -1.0F, 0.0F, 18.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 3.0F));

        PartDefinition tail_fan_end = tail_fan_broad.addOrReplaceChild("tail_fan_end", CubeListBuilder.create().texOffs(0, 84).addBox(-7.0F, -1.0F, 0.0F, 14.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 10.0F));

        PartDefinition arm_left = body_base.addOrReplaceChild("arm_left", CubeListBuilder.create().texOffs(50, 84).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 10.0F, -25.0F));

        PartDefinition arm_right = body_base.addOrReplaceChild("arm_right", CubeListBuilder.create().texOffs(35, 84).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, 10.0F, -25.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(-18, -18).addBox(-10.0F, -16.0F, -9.0F, 1.0F, 16.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(ManateeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body_base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return root;
    }
}