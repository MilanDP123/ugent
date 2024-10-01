
/**
 * Write a description of class Klok here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Klok
{
    private Cijferpaar sec;
    private Cijferpaar min;
    
    public Klok()
    {
        sec = new Cijferpaar();
        min = new Cijferpaar();
    }
    
    public void herstart()
    {
        sec.zetWaarde(0);
        min.zetWaarde(6);
    }
    
    public void ontvangPuls()
    {
        if (sec.geefWaarde() == 0)
        {
            sec.zetWaarde(59);
            min.verminderMet1();
        }
        else
        {
            sec.verminderMet1();
        }
    }
    
    public String geefTijd()
    {
        return min.geefTijd() + ":" + sec.geefTijd();
    }
}
