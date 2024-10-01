/**
 * Oefening Programmeren.
 * 
 * @author Milan De Paepe.
 * @version oktober 2024
 */
public class Lijnwinkel{

    public Lijnwinkel(){
    }

    
    /**
     * Bereken de totale kostprijs van de kaartjes.
     */
    public int geefKostprijs(int aantal){
        if (aantal < 5)
        {
            return aantal * 5;
        }
        
        if (aantal < 10)
        {
            return aantal * 4;
        }
        
        return aantal * 3;
    }
}
