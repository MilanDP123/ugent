
/**
 * Write a description of class Bimaximizer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bimaximizer
{
    private Maximizer xMax;
    private Maximizer yMax;
    
    public Bimaximizer()
    {
        xMax = new Maximizer();
        yMax = new Maximizer();
    }
    
    public void aanbieden(int x, int y)
    {
        xMax.aanbieden(x);
        yMax.aanbieden(y);
    }
    
    public int opvragenX()
    {
        return xMax.opvragen();
    }
    
    public int opvragenY()
    {
        return yMax.opvragen();
    }
}
