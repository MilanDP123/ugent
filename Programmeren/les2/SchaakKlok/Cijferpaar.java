
/**
 * Write a description of class Cijferpaar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cijferpaar
{
    private int teller;
    
    public Cijferpaar()
    {
        teller = 0;
    }
    
    public int geefWaarde()
    {
        return teller;
    }
    
    public void zetWaarde(int w)
    {
        teller = w;
    }
    
    public void verminderMet1()
    {
        teller--;
    }
    
    public String geefTijd()
    {
        String uitvoer;
        uitvoer = teller + "";
        if (teller <= 9)
        {
            uitvoer = "0" + uitvoer;
        }
        
        return uitvoer;
    }
}
