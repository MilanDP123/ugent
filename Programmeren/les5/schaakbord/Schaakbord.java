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
        patroonF();
        
        // hier aanvullen...
    }
    
    private void patroonA()
    {
        for (int i = 1; i < 7; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                addObject(new Dame(false), j, i);
            }
        }
    }
    
    private void patroonB()
    {
        for (int i = 0; i < 8; i+=2)
        {
            for (int j = 0; j < 8; j++)
            {
                addObject(new Toren(false), i, j);
                addObject(new Paard(true), i + 1, j);
            }
        }
    }
    
    private void patroonC()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                addObject(new Pion(true), j,i);
            }
        }
    }
    
    private void patroonD()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                addObject(new Loper((i + j) % 2 == 0), j, i);
            }
        }
    }
    
    private void patroonE()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                addObject(new Koning(i > j), j, i);
            }
        }
    }
    
    private void patroonF()
    {
        for (int i = 1; i < 7; i++)
        {
            for (int j = 1; j < 7; j++)
            {
                switch ( (i + j) % 3) {
                    case 1:
                        addObject(new Paard((i + j) % 2 == 0), j, i);
                        break;
                    case 2:
                        addObject(new Toren((i + j) % 2 == 0), j, i);
                        break;
                    case 0:
                        addObject(new Dame((i + j) % 2 == 0), j, i);
                        break;
                }
            }
        }
    }
}
