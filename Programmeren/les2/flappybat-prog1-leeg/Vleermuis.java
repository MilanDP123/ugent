import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vleermuis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vleermuis extends Actor
{
    private int vel;
    
    /**
     * Constructor van de klasse Vleermuis.
     */
    public Vleermuis()
    {
        super();
        vel = 5;
    }
    
    /**
     * Act - do whatever the Vleermuis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if ("space".equals(Greenfoot.getKey()))
        {
            vel = 5;
            stijg();
            setImage("vleermuis1.png");
        } else
        {
            val();
            setImage("vleermuis2.png");
        }
        
        if (isTouching(Stekel.class) || getY() <= 20 || getY() >=373)
        {
            sterf();
        }
    }
    
    private void stijg()
    {
        setLocation(getX(), getY() - 15);
    }
    
    private void val()
    {
        setLocation(getX(), getY() + vel);
        vel += 5;
    }
    
    private void sterf()
    {
        getWorld().addObject(new DodeVleermuis(), getX(), getY());
        getWorld().removeObject(this);
    }
}
