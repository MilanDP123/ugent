import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deeltje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deeltje extends Actor
{
    private Vector position;
    private Vector velocity;
    private boolean positief;
    
    public Deeltje(double xPos, double yPos, double xVel, double yVel, boolean positief)
    {
        position = new Vector(xPos,yPos);
        velocity = new Vector(xVel,yVel);
        
        this.positief = positief;
        
        if (positief)
        {
            setImage("blue-ball.png");
        }
    }
    
    /**
     * Act - do whatever the Deeltje wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        for (Deeltje d: getWorld().getObjects(Deeltje.class))
        {
            if (d != this)
            {
                velocity.add(computeForce(d));
            }
        }
        
        position.add(velocity);
        
        setLocation(position.getIntX(), position.getIntY());
    }
    
    public Vector getPosition()
    {
        return position;
    }
    
    public Vector computeForce(Deeltje d)
    {
        Vector nieuweVector = position.minus(d.getPosition());
        
        double norm = nieuweVector.norm();
        
        if (positief == d.getPositief())
        {
            nieuweVector.scale(-(400/(norm*norm)));
        }
        else
        {
            nieuweVector.scale(400/(norm*norm));
        }
        
        return nieuweVector;
    }
    
    public boolean getPositief()
    {
        return positief;
    }
}
