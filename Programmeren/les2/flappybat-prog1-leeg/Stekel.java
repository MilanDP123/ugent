import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stekel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stekel extends Actor
{
    private boolean nieuweGemaakt;
    
    public Stekel()
    {
        super();
        nieuweGemaakt = false;
    }
    /**
     * Act - do whatever the Stekel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() - 3, getY());
        
        if (!nieuweGemaakt && getX() <= getWorld().getWidth() / 2)
        {
            nieuweStekel();
            nieuweGemaakt = true;
        }
        
        if (getX() <= 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    private void nieuweStekel()
    {
        getWorld().addObject(new Stekel(), 600 - 5, 0);
        getWorld().addObject(new Stekel(), 600 - 5, 400);
        
    }
}
