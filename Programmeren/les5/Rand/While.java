
/**
 * Write a description of class While here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class While
{
    public int zoekM (int n)
    {
        int m = 1;
        
        while (m < n && 21 * m % n != 1)
        {
            m++;
        }
        
        return m < n ? m : 0;
    }
    
    public boolean isPriem(int getal)
    {
        int deler = 2;
        
        while (deler * deler <= getal && getal % deler != 0)
        {
            deler++;
        }
        
        return deler * deler > getal;
    }
}
