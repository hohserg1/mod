package imnotjahan.mod.danmachi.capabilities;

public interface IStatus
{
    public void giveFalna();
    public boolean getFalna();

    public String getFamilia();
    public void setFamilia(String familiaName);

    public void increase(int points, int id);
    public void decrease(int points);
    public void set(int id, int stat);

    public int get(int id);

    public int getLevel();
}