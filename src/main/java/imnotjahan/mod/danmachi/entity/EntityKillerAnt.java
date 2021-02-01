package imnotjahan.mod.danmachi.entity;

import imnotjahan.mod.danmachi.capabilities.IStatus;
import imnotjahan.mod.danmachi.capabilities.Status;
import imnotjahan.mod.danmachi.capabilities.StatusProvider;
import imnotjahan.mod.danmachi.config.ModConfig;
import imnotjahan.mod.danmachi.util.handlers.LootTableHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;

public class EntityKillerAnt extends EntityZombie
{
    public EntityKillerAnt(World worldIn)
    {
        super(worldIn);

        this.setSize(2.3F, 0.8F);
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(13);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5);
    }

    @Override
    protected ResourceLocation getLootTable()
    {
        return LootTableHandler.KILLER_ANT;
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
    public void onDeath(DamageSource cause)
    {
        super.onDeath(cause);

        if(cause.getTrueSource() instanceof EntityPlayer)
        {
            IStatus status = Minecraft.getMinecraft().player.getCapability(StatusProvider.STATUS_CAP, Status.capSide);
            if(!status.getFalna()) return;

            for(int k = 0; k < 5; k++)
            {
                status.increase(ModConfig.statusIncreases.get("killer_ant")[k], k + 1);
            }

            status.increase(ModConfig.statusIncreases.get("killer_ant")[5], 7);
        }
    }

    @Override
    protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
    {
        super.dropLoot(wasRecentlyHit, lootingModifier, source);

        if(ModConfig.dropMagicCrystals)
        {
            ResourceLocation resource = LootTableHandler.KILLER_ANT_STONE;
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
