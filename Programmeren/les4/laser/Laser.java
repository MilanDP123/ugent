/**
 * Write a description of class Laser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laser
{
    private int width;
    private int height;
    private int horHits;
    private int verHits;
    
    public Laser()
    {
        width = 0;
        height = 0;
        horHits = 0;
        verHits = 0;
    }
    
    public void setWalls(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    
    public void shoot()
    {
        int ggd = ggd(width, height);
        horHits = (width / ggd) - 1;
        verHits = (height / ggd) - 1;
    }
    
    private int ggd(int a, int b)
    {
        return b == 0 ? a : ggd(b, a%b);
    }
    
    public int getHits()
    {
        return horHits + verHits;
    }
    
    public int getHorHits()
    {
        return horHits;
    }
    
    public int getVerHits()
    {
        return verHits;
    }
}


