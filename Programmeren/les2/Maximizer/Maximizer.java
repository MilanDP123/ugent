
/**
 * Write a description of class Maximizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maximizer
{
    private int max;
    private boolean eerste;
    
    public Maximizer()
    {
        max = 0;
        eerste = true;
    }
    
    public void aanbieden(int getal)
    {
        if (eerste || getal > max)
        {
            max = getal;
            eerste = false;
        }
    }
    
    public int opvragen()
    {
        return max;
    }
}
