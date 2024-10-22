import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class Elementaal extends Actor
{
    private int richting;
    private String toestand;
    private int leeftijd;
    private static final Random RG = new Random();
    
    public Elementaal () {
        this.richting = 0; // van west naar oost
        leeftijd = 0;
        toestand = "Glijder";
    }
    
    private void keerOm () {
        richting = (richting + 180) % 360;
    }
    
    /**
     * Beweeg zonder de orientatie van de prent aan te passen
     */
    private void glijd () {
        setRotation(richting);
        move(1);
        setRotation(0);
    }

    public void setRichting (int richting) {
        this.richting = richting;
    }

    public void act()
    {
        leeftijd--;
        if (leeftijd == 0)
        {
            if (toestand.equals("Terugtrekker"))
            {
                keerOm();
            }
            toestand = "Glijder";
        }
        
        if (toestand.equals("Wachter"))
        {
            return;
        }
        
        
        if (isAtEdge()) {
            keerOm();
            toestand = "Wachter";
            leeftijd = RG.nextInt(100);
            glijd();
        }
        
        else if (getObjectsInRange(50,null).size() > 0 && toestand.equals("Glijder")) {
            toestand = "Terugtrekker";
            setRichting(-richting);
            leeftijd = RG.nextInt(40) + 40;
        }
        
        glijd();
    }    
}

