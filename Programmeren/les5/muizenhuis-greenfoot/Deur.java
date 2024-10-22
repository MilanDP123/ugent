/**
 * Deur met twee sensoren waarmee je kan detecteren of een muis van de ene kamer naar de andere
 * loopt. We noemen de beide kanten van een deur (en de overeenkomstige sensoren) 'links'
 * en 'rechts'.
 */
public class Deur
{
    // Vul de velden aan
    private Kamer links;
    private Kamer rechts;
    private int toestand;

    // Maak een constructor met twee parameters, een voor de kamer aan de linkerkant
    // van de deur, een voor de kamer aan de rechterkant

    public Deur(Kamer links, Kamer rechts)
    {
        this.links = links;
        this.rechts = rechts;
        toestand = 0;
    }

    /**
     * De linker sensor detecteert een muis.
     */
    public void linkerSensorAan() {
        if (toestand%4 == 0)
        {
            toestand++;
        }
        else if (toestand == 3)
        {
            toestand--;
        }
    }

    /**
     * De linker sensor detecteert geen muis.
     */
    public void linkerSensorUit() {
        if (toestand == 6)
        {
            toestand = 0;
            links.vermeerderMuizen();
            rechts.verminderMuizen();

        }
        else if (toestand%4 == 1)
        {
            toestand--;
        }
        else if (toestand == 2)
        {
            toestand++;
        }
        
    }

    /**
     * De rechter sensor detecteert een muis.
     */
    public void rechterSensorAan() {
        if (toestand == 0)
        {
            toestand = 4;
        }
        else if (toestand == 1)
        {
            toestand++;
        }
        else if (toestand == 6)
        {
            toestand--;
        }
    }

    /**
     * De rechter sensor detecteert geen muis.
     */
    public void rechterSensorUit() {
        if (toestand == 3)
        {
            toestand = 0;
            links.verminderMuizen();
            rechts.vermeerderMuizen();
        }
        else if (toestand == 2)
        {
            toestand--;
        }
        else if (toestand == 4)
        {
            toestand = 0;
        }
        else if (toestand == 5)
        {
            toestand++;
        }
    }
}
