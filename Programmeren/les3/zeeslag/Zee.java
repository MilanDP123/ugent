import java.util.ArrayList;

/**
 * Write a description of class Zee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zee
{
    private int rijen;
    private int kolommen;
    private ArrayList<Boot> boten;
    
    public Zee(int rijen, int kolommen)
    {
        this.rijen = rijen;
        this.kolommen = kolommen;
        boten = new ArrayList<Boot>();
    }
    
    public int aantalBoten()
    {
        return boten.size();
    }
    
    public boolean isRaak(int x, int y)
    {
        for (Boot b: boten)
        {
            if (b.isRaak(x,y))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean overlaptBoot(Boot boot)
    {
        for (Boot b: boten)
        {
            if (b.overlaptBoot(boot))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean pastInZee(Boot boot)
    {
        return boot.pastInZee(kolommen, rijen);
    }
    
    public void voegBootToe(Boot boot)
    {
        if (pastInZee(boot) && !overlaptBoot(boot))
        {
            boten.add(boot);
        }
    }
}
