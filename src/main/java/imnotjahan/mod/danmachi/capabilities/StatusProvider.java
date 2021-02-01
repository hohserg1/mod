package imnotjahan.mod.danmachi.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class StatusProvider implements ICapabilitySerializable<NBTBase>
{
    @CapabilityInject(IStatus.class)
    public static final Capability<IStatus> STATUS_CAP = null;

    private IStatus instance = STATUS_CAP.getDefaultInstance();

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing)
    {
        return capability == STATUS_CAP && facing == Status.capSide;
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing)
    {
        return hasCapability(capability, facing) ? STATUS_CAP.<T>cast(this.instance) : null;
    }

    @Override
    public NBTBase serializeNBT()
    {
        return STATUS_CAP.getStorage().writeNBT(STATUS_CAP, this.instance, Status.capSide);
    }

    @Override
    public void deserializeNBT(NBTBase nbt)
    {
        STATUS_CAP.getStorage().readNBT(STATUS_CAP, this.instance, Status.capSide, nbt);
    }
}