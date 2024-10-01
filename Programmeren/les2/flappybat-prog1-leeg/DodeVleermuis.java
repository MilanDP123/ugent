import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DodeVleermuis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DodeVleermuis extends Actor
{
    private int vel;
    
    public DodeVleermuis()
    {
        vel = 5;
    }
    /**
     * Act - do whatever the DodeVleermuis wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + vel);
        vel += 5;
        
        if (getY() >= 373)
        {
            Greenfoot.stop();
        }
    }
}
