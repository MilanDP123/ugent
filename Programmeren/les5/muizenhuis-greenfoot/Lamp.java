import greenfoot.*;


public class Lamp extends Actor {
    public Lamp(boolean aan) {
        if (aan)
        {
            setImage("lamp-aan.png");
        }
        else 
        {
            setImage("lamp-uit.png");
        }
    }
    
    public void lampAan()
    {
        setImage("lamp-aan.png");
    }
    
    public void lampUit()
    {
        setImage("lamp-uit.png");
    }
}
