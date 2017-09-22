package stevekung.mods.moreplanets.client.renderer;

import net.minecraft.item.ItemStack;
import stevekung.mods.moreplanets.client.renderer.entity.*;
import stevekung.mods.moreplanets.entity.EntityBlackHole;
import stevekung.mods.moreplanets.entity.EntityBlackHoleStorage;
import stevekung.mods.moreplanets.entity.EntitySpaceCapsule;
import stevekung.mods.moreplanets.entity.projectile.EntityLaserBullet;
import stevekung.mods.moreplanets.entity.projectile.EntitySpaceFishHook;
import stevekung.mods.moreplanets.module.planets.chalos.client.renderer.entity.*;
import stevekung.mods.moreplanets.module.planets.chalos.entity.*;
import stevekung.mods.moreplanets.module.planets.chalos.entity.projectile.EntityCheeseSpore;
import stevekung.mods.moreplanets.module.planets.chalos.entity.projectile.EntitySmallCheeseSpore;
import stevekung.mods.moreplanets.module.planets.diona.client.renderer.entity.*;
import stevekung.mods.moreplanets.module.planets.diona.entity.*;
import stevekung.mods.moreplanets.module.planets.diona.entity.projectile.EntityAntiGravityArrow;
import stevekung.mods.moreplanets.module.planets.diona.entity.projectile.EntityInfectedCrystallizeArrow;
import stevekung.mods.moreplanets.module.planets.fronos.client.render.entity.RenderBearry;
import stevekung.mods.moreplanets.module.planets.fronos.client.render.entity.RenderGiantBlueberry;
import stevekung.mods.moreplanets.module.planets.fronos.client.render.entity.RenderJellySlime;
import stevekung.mods.moreplanets.module.planets.fronos.client.render.entity.RenderMarshmallow;
import stevekung.mods.moreplanets.module.planets.fronos.entity.EntityBearry;
import stevekung.mods.moreplanets.module.planets.fronos.entity.EntityGiantBlueberry;
import stevekung.mods.moreplanets.module.planets.fronos.entity.EntityJellySlime;
import stevekung.mods.moreplanets.module.planets.fronos.entity.EntityMarshmallow;
import stevekung.mods.moreplanets.module.planets.nibiru.client.renderer.entity.*;
import stevekung.mods.moreplanets.module.planets.nibiru.entity.*;
import stevekung.mods.moreplanets.module.planets.nibiru.entity.projectile.*;
import stevekung.mods.moreplanets.module.planets.nibiru.entity.weather.EntityNibiruLightningBolt;
import stevekung.mods.moreplanets.module.planets.nibiru.items.NibiruItems;
import stevekung.mods.moreplanets.util.client.renderer.entity.RenderSnowballMP;
import stevekung.mods.moreplanets.util.helper.ClientRegisterHelper;

public class EntityRendererMP
{
    public static void init()
    {
        ClientRegisterHelper.registerEntityRendering(EntityAlbetiusWorm.class, RenderAlbetiusWorm::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCrystallizeWorm.class, RenderInfectedCrystallizeWorm::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCrystallizeSpider.class, RenderInfectedCrystallizeSpider::new);
        ClientRegisterHelper.registerEntityRendering(EntityTier4Rocket.class, RenderTier4Rocket::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCrystallizeTentacle.class, RenderInfectedCrystallizeTentacle::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCrystallizeSlimeBoss.class, RenderInfectedCrystallizeSlimeBoss::new);
        ClientRegisterHelper.registerEntityRendering(EntityZeliusZombie.class, RenderZeliusZombie::new);
        ClientRegisterHelper.registerEntityRendering(EntityZeliusCreeper.class, RenderZeliusCreeper::new);
        ClientRegisterHelper.registerEntityRendering(EntityCheeseCubeEyeBoss.class, RenderCheeseCubeEyeBoss::new);
        ClientRegisterHelper.registerEntityRendering(EntityCheeseSpore.class, RenderCheeseSpore::new);
        ClientRegisterHelper.registerEntityRendering(EntitySmallCheeseSpore.class, RenderSmallCheeseSpore::new);
        ClientRegisterHelper.registerEntityRendering(EntityCheeseFloater.class, RenderCheeseFloater::new);
        ClientRegisterHelper.registerEntityRendering(EntityCheeseSlime.class, RenderCheeseSlime::new);
        ClientRegisterHelper.registerEntityRendering(EntityCheeseCow.class, RenderCheeseCow::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCrystallizeBomb.class, RenderInfectedCrystallizeBomb::new);
        ClientRegisterHelper.registerEntityRendering(EntityTier5Rocket.class, RenderTier5Rocket::new);
        ClientRegisterHelper.registerEntityRendering(EntityGiantWorm.class, RenderGiantWorm::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedZombie.class, RenderInfectedZombie::new);
        ClientRegisterHelper.registerEntityRendering(EntityAlienMiner.class, RenderAlienMiner::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCrystallizeSlimeMinion.class, RenderInfectedCrystallizeSlimeMinion::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedWorm.class, RenderInfectedWorm::new);
        ClientRegisterHelper.registerEntityRendering(EntityNibiruLightningBolt.class, RenderNibiruLightningBolt::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedSnowman.class, RenderInfectedSnowman::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedSnowball.class, manager -> new RenderSnowballMP(manager, new ItemStack(NibiruItems.INFECTED_SNOWBALL)));
        ClientRegisterHelper.registerEntityRendering(EntityZeliusSkeleton.class, RenderZeliusSkeleton::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedGuardian.class, RenderInfectedGuardian::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedElderGuardian.class, RenderInfectedElderGuardian::new);
        ClientRegisterHelper.registerEntityRendering(EntityBlackHole.class, RenderBlackHole::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedSquid.class, RenderInfectedSquid::new);
        ClientRegisterHelper.registerEntityRendering(EntityDarkLightningBolt.class, RenderDarkLightningBolt::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedEgg.class, manager -> new RenderSnowballMP(manager, new ItemStack(NibiruItems.INFECTED_EGG)));
        ClientRegisterHelper.registerEntityRendering(EntityInfectedChicken.class, RenderInfectedChicken::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCrystallizeArrow.class, RenderInfectedCrystallizeArrow::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCow.class, RenderInfectedCow::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedArrow.class, RenderInfectedArrow::new);
        ClientRegisterHelper.registerEntityRendering(EntitySpaceFishHook.class, RenderSpaceFishHook::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCaveSpider.class, RenderInfectedCaveSpider::new);
        ClientRegisterHelper.registerEntityRendering(EntityAlienBeam.class, RenderAlienBeam::new);
        ClientRegisterHelper.registerEntityRendering(EntityVeinEye.class, manager -> new RenderSnowballMP(manager, new ItemStack(NibiruItems.VEIN_EYE)));
        ClientRegisterHelper.registerEntityRendering(EntityShlime.class, RenderShlime::new);
        ClientRegisterHelper.registerEntityRendering(EntityLaserBullet.class, RenderLaserBullet::new);
        ClientRegisterHelper.registerEntityRendering(EntityNibiruVillager.class, RenderNibiruVillager::new);
        ClientRegisterHelper.registerEntityRendering(EntityZergius.class, RenderZergius::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedCreeper.class, RenderInfectedCreeper::new);
        ClientRegisterHelper.registerEntityRendering(EntityInfectedSkeleton.class, RenderInfectedSkeleton::new);
        ClientRegisterHelper.registerEntityRendering(EntitySpaceCapsule.class, RenderSpaceCapsule::new);
        ClientRegisterHelper.registerEntityRendering(EntityVeinFloater.class, RenderVeinFloater::new);
        ClientRegisterHelper.registerEntityRendering(EntityVeinFloaterMinion.class, RenderVeinFloaterMinion::new);
        ClientRegisterHelper.registerEntityRendering(EntityVeinBall.class, RenderVeinBall::new);
        ClientRegisterHelper.registerEntityRendering(EntityMiniVeinFloater.class, RenderMiniVeinFloater::new);
        ClientRegisterHelper.registerEntityRendering(EntityTier6Rocket.class, RenderTier6Rocket::new);
        ClientRegisterHelper.registerEntityRendering(EntityGiantBlueberry.class, RenderGiantBlueberry::new);
        ClientRegisterHelper.registerEntityRendering(EntityMarshmallow.class, RenderMarshmallow::new);
        ClientRegisterHelper.registerEntityRendering(EntityBearry.class, RenderBearry::new);
        ClientRegisterHelper.registerEntityRendering(EntityBlackHoleStorage.class, RenderBlackHoleStorage::new);
        ClientRegisterHelper.registerEntityRendering(EntityAntiGravityArrow.class, RenderAntiGravityArrow::new);
        ClientRegisterHelper.registerEntityRendering(EntityJellySlime.class, RenderJellySlime::new);
    }
}