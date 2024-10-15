import java.util.ArrayList;

/**
 * Write a description of class Cafe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cafe
{
    private ArrayList<Bier> bieren;
    
    public Cafe()
    {
        bieren = new ArrayList<>();
    }
    
    public void voegBierToe(Bier bier)
    {
        bieren.add(bier);
    }
    
    public void drankLijst()
    {
        for (Bier bier: bieren)
        {
            bier.print();
        }
    }
    
    public void beperkteLijst(String startletter)
    {
        for (Bier bier: bieren)
        {
            if (bier.getNaam().substring(0,1).equals(startletter))
            {
                bier.print();
            }
        }
    }
    
    public ArrayList<Bier> zwareBieren(double alcoholpercentage)
    {
        ArrayList<Bier> lijst = new ArrayList<>();
        for (Bier bier: bieren)
        {
            if (bier.getAlcoholpercentage() >= alcoholpercentage)
            {
                lijst.add(bier);
            }
        }
        return lijst;
    }
    
    public Bier stadsbier(String stad)
    {
        int index = 0;
        while (index < bieren.size() && bieren.get(index).getStad().equals(stad))
        {
            index++;
        }
        
        return index < bieren.size() ? bieren.get(index): null;
    }
}
