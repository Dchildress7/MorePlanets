package stevekung.mods.moreplanets.module.planets.diona.client.renderer.tileentity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import stevekung.mods.moreplanets.module.planets.diona.client.model.ModelInfectedCrystallizeEnderCore;
import stevekung.mods.moreplanets.module.planets.diona.tileentity.TileEntityInfectedCrystallizeEnderCore;

public class TileEntityInfectedCrystallizeEnderCoreRenderer extends TileEntitySpecialRenderer<TileEntityInfectedCrystallizeEnderCore>
{
    private static ResourceLocation texture = new ResourceLocation("moreplanets:textures/model/infected_crystallize_ender_core.png");
    private static ResourceLocation textureLight1 = new ResourceLocation("moreplanets:textures/model/infected_crystallize_ender_core_glow.png");
    private ModelInfectedCrystallizeEnderCore model = new ModelInfectedCrystallizeEnderCore();

    @Override
    public void render(TileEntityInfectedCrystallizeEnderCore tile, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
    {
        float renderPartialTicks = tile.renderTicks + partialTicks;
        float ticks = MathHelper.sin(renderPartialTicks / 8) / 10.0F + 0.75F;
        ticks = ticks * ticks + ticks;
        float lightTime = (MathHelper.sin(renderPartialTicks / 3) + 1F) / 2F + 0.15F;
        float lightMapSaveX = OpenGlHelper.lastBrightnessX;
        float lightMapSaveY = OpenGlHelper.lastBrightnessY;
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        this.bindTexture(TileEntityInfectedCrystallizeEnderCoreRenderer.texture);
        this.model.renderAll(ticks * 0.2F);
        GlStateManager.color(lightTime, lightTime, lightTime);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
        GlStateManager.disableLighting();
        this.bindTexture(TileEntityInfectedCrystallizeEnderCoreRenderer.textureLight1);
        this.model.renderAll(ticks * 0.2F);
        GlStateManager.enableBlend();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightMapSaveX, lightMapSaveY);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }
}