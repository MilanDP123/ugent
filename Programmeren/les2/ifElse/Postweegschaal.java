/**
 * Oefening Programmeren
 * 
 * @author Milan De Paepe. 
 * @version oktober 2024
 */
public class Postweegschaal{
    
    public Postweegschaal(){
    }

    /**
     * Bereken de prijs voor een postpakket met het opgegeven gewicht.
     */
    public int geefPrijs(int gewicht){
      //vul deze code aan
      if (gewicht <= 2)
      {
          return 18;
      }
      
      return 18 + (gewicht - 2) * 5;
    }
}
