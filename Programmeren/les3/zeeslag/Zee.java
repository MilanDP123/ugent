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
        int index = 0;
        while (index < boten.size() && !boten.get(index).isRaak(x,y))
        {
            index++;
        }
        
        return index < boten.size();
    }
    
    public boolean overlaptBoot(Boot boot)
    {   
        int index = 0;
        while (index < boten.size() && !boten.get(index).overlaptBoot(boot))
        {
            index++;
        }
        
        return index < boten.size();
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
