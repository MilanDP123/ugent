import java.util.Random;

/**
 * Write a description of class Rand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rand
{
    private static final int AANTAL_POGINGEN = 10_000_000;
    
    private static final Random RG = new Random();
    
    public double benaderPi()
    {
        int aantal = 0;
        for (int i = 0; i < AANTAL_POGINGEN; i++)
        {
            double x = RG.nextDouble();
            double y = RG.nextDouble();
            
            if (x*x + y*y < 1)
            {
                aantal++;
            }
        }
        
        return 4.0 * aantal / AANTAL_POGINGEN;
    }
    
    public String plaatsPunt(String str)
    {
        if (str.length() <= 1)
        {
            return str;
        }
        int pos = RG.nextInt(str.length() - 1) + 1;
        return str.substring(0, pos) + "." + str.substring(pos);
    }
}
