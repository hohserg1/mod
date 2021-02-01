package imnotjahan.mod.danmachi.entity;

import imnotjahan.mod.danmachi.capabilities.IStatus;
import imnotjahan.mod.danmachi.capabilities.Status;
import imnotjahan.mod.danmachi.capabilities.StatusProvider;
import imnotjahan.mod.danmachi.config.ModConfig;
import imnotjahan.mod.danmachi.util.handlers.LootTableHandler;
import imnotjahan.mod.danmachi.util.handlers.SoundHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;

public class EntityLygerfang extends EntityZombie
{
    public EntityLygerfang(World worldIn)
    {
        super(worldIn);

        this.setSize(0.9F, 1F);
    }

    @Override
    protected boolean shouldBurnInDay()
    {
        return false;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6);
    }

    @Override
    protected ResourceLocation getLootTable()
    {
        return LootTableHandler.LYGERFANG;
    }

    @Override
    public boolean isChild()
    {
        return false;
    }

    @Override
    public boolean canBeLeashedTo(EntityPlayer player)
    {
        return true;
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return SoundHandler.ENTITY_LYGERFANG_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundHandler.ENTITY_LYGERFANG_HURT;
    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundHandler.ENTITY_LYGERFANG_DEATH;
    }

    @Override
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);

        if(cause.getTrueSource() instanceof EntityPlayer)
        {
            IStatus status = Minecraft.getMinecraft().player.getCapability(StatusProvider.STATUS_CAP, Status.capSide);
            if(!status.getFalna()) return;

            for(int k = 0; k < 5; k++)
            {
                status.increase(ModConfig.statusIncreases.get("lygerfang")[k], k + 1);
            }

            status.increase(ModConfig.statusIncreases.get("lygerfang")[5], 7);
        }
    }

    @Override
    protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
    {
        super.dropLoot(wasRecentlyHit, lootingModifier, source);

        if(ModConfig.dropMagicCrystals)
        {
            ResourceLocation resource = LootTableHandler.LYGERFANG_STONE;
            LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resource);

            LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);

            if (wasRecentlyHit && this.attackingPlayer != null)
            {
                lootcontext$builder = lootcontext$builder.withPlayer(this.attackingPlayer).withLuck(this.attackingPlayer.getLuck());
            }

            ItemStack stack = loottable.generateLootForPools(this.rand, lootcontext$builder.build()).get(0);
            entityDropItem(stack, 0);
        }
    }
}
