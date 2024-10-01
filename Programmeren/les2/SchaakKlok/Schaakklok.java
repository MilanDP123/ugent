
/**
 * Write a description of class Schaakklok here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Schaakklok
{
    private Klok witteKlok;
    private Klok zwarteKlok;
    private int speler;
    
    /**
     * Constructor for objects of class Schaakklok
     */
    public Schaakklok()
    {
        witteKlok = new Klok();
        zwarteKlok = new Klok();
        speler = 1;
    }

    public void ontvangPuls()
    {
        if (speler == 1)
        {
            witteKlok.ontvangPuls();
        }
        else
        {
            zwarteKlok.ontvangPuls();
        }
    }
    
    public void wisselSpeler()
    {
        if (speler == 1)
        {
            speler = 2;
        }
        else
        {
            speler = 1;
        }
    }
    
    public String geefTijd(int speler){
        return witteKlok.geefTijd();
    }
    
    public void herstart()
    {
        witteKlok.herstart();
        zwarteKlok.herstart();
        speler = 1;
    }
    

    
}
