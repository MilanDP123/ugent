import greenfoot.*;

/**
 * Sensor die detecteert wanneer er een muis passeert.
 */
public class Sensor extends Actor {
    private Deur deur;
    private boolean isLinks;
    private boolean isHorizontaal;
    
    public Sensor(Deur deur, boolean isLinks, boolean isHorizontaal){
        this.deur = deur;
        this.isLinks = isLinks;
        this.isHorizontaal = isHorizontaal;
    }
    
    public void act() 
    {
        if (isTouching(Muis.class))
        {
            if (isLinks)
            {
                deur.linkerSensorAan();
            }
            else
            {
                deur.rechterSensorAan();
            }
            
            if (isHorizontaal)
            {
                setImage("sensor-aan-horizontaal.png");
            }
            else 
            {
                setImage("sensor-aan-verticaal.png");
            }
        }
        else 
        {
            if (isLinks)
            {
                deur.linkerSensorUit();
            }
            else
            {
                deur.rechterSensorUit();
            }
            
            if (isHorizontaal)
            {
                setImage("sensor-uit-horizontaal.png");
            }
            else 
            {
                setImage("sensor-uit-verticaal.png");
            }
        }
        
    }
}
