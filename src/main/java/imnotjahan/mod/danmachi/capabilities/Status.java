package imnotjahan.mod.danmachi.capabilities;

import net.minecraft.util.EnumFacing;

public class Status implements IStatus
{
    public static final EnumFacing capSide = EnumFacing.UP;

    private int hasFalna = 0;
    private int strength = 0;
    private int endurance = 0;
    private int dexterity = 0;
    private int agility = 0;
    private int magic = 0;
    private int level = 1;
    private int excelia = 0;

    private String familia = "";

    @Override
    public void decrease(int points)
    {
        this.strength -= points;

        if (this.strength < 0.0F) this.strength = 0;
    }

    @Override
    public void increase(int points, int id)
    {
        if(id != 7)
        {
            points /= level;
        }

        switch(id)
        {
            case 0:
                this.hasFalna += points;
                break;

            case 1:
                this.strength += points;
                break;

            case 2:
                this.endurance += points;
                break;

            case 3:
                this.dexterity += points;
                break;

            case 4:
                this.agility += points;
                break;

            case 5:
                this.magic += points;
                break;

            case 6:
                this.level += points;
                break;

            case 7:
                this.excelia += points;
                break;
        }
    }

    @Override
    public void set(int id, int stat)
    {
        switch(id)
        {
            case 0:
                this.hasFalna = stat;
                break;

            case 1:
                this.strength = stat;
                break;

            case 2:
                this.endurance = stat;
                break;

            case 3:
                this.dexterity = stat;
                break;

            case 4:
                this.agility = stat;
                break;

            case 5:
                this.magic = stat;
                break;

            case 6:
                this.level = stat;
                break;

            case 7:
                this.excelia = stat;
                break;
        }
    }

    @Override
    public int get(int id)
    {
        switch(id)
        {
            case 0:
                return this.hasFalna;

            case 1:
                return this.strength;

            case 2:
                return this.endurance;

            case 3:
                return this.dexterity;

            case 4:
                return this.agility;

            case 5:
                return this.magic;

            case 6:
                return this.level;

            case 7:
                return this.excelia;
        }

        return 0;
    }

    @Override
    public void giveFalna()
    {
        hasFalna = 1;
    }

    @Override
    public boolean getFalna()
    {
        return (hasFalna == 1);
    }

    @Override
    public String getFamilia()
    {
        return familia;
    }

    @Override
    public void setFamilia(String familia)
    {
        this.familia = familia;
    }

    @Override
    public int getLevel()
    {
        if(excelia / (100 * level) >= 1)
        {
            level += 1;
            excelia = 0;

            strength = 0;
            endurance = 0;
            dexterity = 0;
            agility = 0;
            magic = 0;
        }

        return level;
    }
}
