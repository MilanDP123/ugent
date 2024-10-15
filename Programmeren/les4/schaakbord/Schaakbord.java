import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Oefeningen op de for-lus.
 */
public class Schaakbord extends World
{

    /**
     * Constructor
     */
    public Schaakbord()
    {   
        // 8 x 8 cellen van 45 x 45 pixels
        super(8, 8, 45); 
        patroonA();
        
        // hier aanvullen...
    }
    
    private void patroonA()
    {
        for (int i = 0; i < 8; i++)
        {
            addObject(new Toren(true), 0, i);
        }
    }
    
    private void patroonB()
    {
        for (int i = 1; i < 7; i++)
        {
            addObject(new Pion(false), i, 0);
        }
    }
    
    private void patroonC()
    {
        for (int i = 0; i < 8; i++)
        {
            addObject(new Loper(false),7 - i, i);
        }
    }
    
    private void patroonD()
    {
        for (int i = 0; i < 8; i += 2)
        {
            addObject(new Paard(true), i, 2);
        }
    }
    
    private void patroonE()
    {
        for (int i = 0; i < 8; i++)
        {
            addObject( i % 2 == 0 ? new Toren(false): new Dame(true), i, 6);
        }
    }
    
    private void patroonF()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (i == 0 || i == 7 || j == 0 || j == 7)
                {
                    addObject( new Dame(false), i, j);
                }
            }
        }
    }
}
