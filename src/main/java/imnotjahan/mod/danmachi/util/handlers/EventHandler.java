package imnotjahan.mod.danmachi.util.handlers;

import imnotjahan.mod.danmachi.capabilities.IStatus;
import imnotjahan.mod.danmachi.capabilities.Status;
import imnotjahan.mod.danmachi.capabilities.StatusProvider;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventHandler
{
    IAttributeInstance attribute;

    @SubscribeEvent
    public void livingUpdate(LivingEvent.LivingUpdateEvent event)
    {
        if(event.getEntityLiving() instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.getEntityLiving();
            attribute = player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH);
            IStatus cap = player.getCapability(StatusProvider.STATUS_CAP, Status.capSide);

            attribute.setBaseValue(20 + Math.floor(cap.get(2) / 100));

            player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(cap.get(1) / 100 + 1);

            //player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.1F + cap.get(3));
        }
    }

    @SubscribeEvent
    public void onPlayerClone(PlayerEvent.Clone event) {
        IStatus oldCap = event.getOriginal().getCapability(StatusProvider.STATUS_CAP, Status.capSide);
        IStatus cap = event.getEntityPlayer().getCapability(StatusProvider.STATUS_CAP, Status.capSide);

        System.out.println("has status:" + oldCap.get(0));

        cap.set(0, 1);
        cap.set(1, oldCap.get(1));
        cap.set(2, oldCap.get(2));
        cap.set(3, oldCap.get(3));
        cap.set(4, oldCap.get(4));
        cap.set(5, oldCap.get(5));
        cap.set(6, oldCap.get(6));
        cap.set(7, oldCap.get(7));

        cap.setFamilia(oldCap.getFamilia());
    }
}