import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Simulatie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulatie extends World
{

    /**
     * Constructor for objects of class Simulatie.
     * 
     */
    public Simulatie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(new Deeltje(200, 200, 1, 1, true), 0,0);
        addObject(new Deeltje(200, 300, -1, -1, false),0,0);
        addObject(new Deeltje(300, 200, 1, 0, true),0,0);
    }
}
