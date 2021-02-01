package imnotjahan.mod.danmachi.capabilities;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;

public class StatusStorage implements Capability.IStorage<IStatus>
{
    @Override
    public NBTBase writeNBT(Capability<IStatus> capability, IStatus instance, EnumFacing side)
    {
        if(Status.capSide == side)
        {
            NBTTagCompound status = new NBTTagCompound();
            status.setInteger("hasFalna", instance.get(0));
            status.setInteger("strength", instance.get(1));
            status.setInteger("edurance", instance.get(2));
            status.setInteger("dexterity", instance.get(3));
            status.setInteger("agility", instance.get(4));
            status.setInteger("magic", instance.get(5));
            status.setInteger("level", instance.get(6));
            status.setInteger("excelia", instance.get(7));
            status.setString("familia", instance.getFamilia());
            return status;
        }

        return new NBTTagCompound();
    }

    @Override
    public void readNBT(Capability<IStatus> capability, IStatus instance, EnumFacing side, NBTBase nbt)
    {
        if(Status.capSide == side)
        {
            if(nbt instanceof NBTTagCompound)
            {
                NBTTagCompound tag = (NBTTagCompound)nbt;

                System.out.println("Strength: " + tag.getInteger("strength"));

                instance.set(0, tag.getInteger("hasFalna"));
                instance.set(1, tag.getInteger("strength"));
                instance.set(2, tag.getInteger("endurance"));
                instance.set(3, tag.getInteger("dexterity"));
                instance.set(4, tag.getInteger("agility"));
                instance.set(5, tag.getInteger("magic"));
                instance.set(6, tag.getInteger("level"));
                instance.set(7, tag.getInteger("excelia"));
                instance.setFamilia(tag.getString("familia"));
            }
        }
    }
}