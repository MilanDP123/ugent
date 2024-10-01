
/**
 * Objecten van deze klasse besturen één van de twee klokjes van de schaakklok.
 * 
 * 2016 (c) Kris Coolsaet Universiteit Gent
 */
public class Klokje {
    
    // Velden
    ///////////
    
    private Cijferpaar sec;
    
    private Cijferpaar min;
    
    // Constructoren
    ////////////////
    
    /**
     * Constructor. Initialiseert de velden van dit object.
     */
    public Klokje() {
        sec = new Cijferpaar();
        min = new Cijferpaar();
    }
    
    // Methoden
    ///////////
    
    /**
     * Geeft aan dat de minuten en seconden teruggezet moeten worden naar
     * de beginwaarde van een wedstrijd.
     */
    public void herstart() {
        sec.zetWaarde(0);
        min.zetWaarde(6);
    }
    
    /**
     * Wordt elke seconde opgeroepen voor de klok van de speler die aan zet is,
     */
    public void ontvangPuls() {
        if (sec.geefWaarde() == 0 && min.geefWaarde() == 0)
        {
            return;
        }
        
        if (sec.geefWaarde() == 0) {
            sec.zetWaarde(59);
            min.verminderMet1();
        } else {
            sec.verminderMet1();
        }
    }
    
    /**
     * Geef de tijd terug die door dit klokje wordt voorgesteld
     */
    public String geefTijd() {
        return min.geefTijd() + ":" + sec.geefTijd();
    }
    
    /**
     * Voeg extra seconden toe aan het klokje
     */
    public void extraTijd()
    {
        if (sec.geefWaarde() >= 58)
        {
            min.extraTijd(1);
        }
        
        sec.extraTijd(2);
    }
}
