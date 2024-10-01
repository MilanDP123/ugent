/**
 * Oefening Programmeren.
 * 
 * @author Milan De Paepe
 * @version oktober 2024
 */
public class Pensioenregeling{
    public Pensioenregeling(){
    }
    
    /**
     * Bereken het pensioen op basis van de gegeven leeftijd.
     * Het tweede argument: true voor man, false voor vrouw.
     */
    public int geefPensioen(int leeftijd, boolean geslacht){
        int totaal = 0;
        if (geslacht)
        {
            if (leeftijd > 65)
            {
                totaal += 50;
            }
            if (leeftijd > 70)
            {
                totaal += 20;
            }
        }
        else
        {
            if (leeftijd > 60)
            {
                totaal += 45;
            }
            
            if (leeftijd > 65)
            {
                totaal += 25;
            }
        }
        
        return totaal;
    }
}
