
/**
 * Write a description of class Boot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boot
{
    private int x;
    private int y;
    private String orientatie;
    private int aantalVakjes;
    
    public Boot(int x, int y, String orientatie, int aantalVakjes)
    {
        this.x = x;
        this.y = y;
        this.orientatie = orientatie;
        this.aantalVakjes = aantalVakjes;
    }
    
    public boolean isRaak(int x, int y)
    {
        if (orientatie.equals("horizontaal"))
        {
            return this.y == y && this.x <= x && this.x + aantalVakjes >= x;
        }
        
        return this.x == x && this.y <= y && this.y + aantalVakjes >= x;
    }
    
    public boolean overlaptBoot(Boot boot)
    {
        boolean uitvoer = false;
        if (orientatie.equals("horizontaal"))
        {
            for (int i = x; i <= x + aantalVakjes && !uitvoer; i++)
            {
                uitvoer = boot.isRaak(i,y);
            }
        } 
        else
        {
            for (int i = y; i <= y + aantalVakjes && !uitvoer; i++)
            {
                uitvoer = boot.isRaak(x,i);
            }
        }
        return uitvoer;
    }
    
    public boolean pastInZee(int xMax, int yMax)
    {
        if (orientatie.equals("horizontaal"))
        {
            return x + aantalVakjes <= xMax && y <= yMax;
        }
        
        return y + aantalVakjes <= yMax && x <= xMax;
    }
}
