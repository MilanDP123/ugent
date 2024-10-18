
/**
 * Write a description of class Lotto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lotto
{
    private int n;
    private int m;
    
    public Lotto(int n, int m)
    {
        this.n = n;
        this.m = m;
    }
    
    public int binom(int k, int i)
    {
        double totaal = 1;
        for (int j = 0; j < i; j++)
        {
            totaal *= (k - j);
            totaal /= (i - j);
        }
        
        return (int)Math.round(totaal);
    }
    
    public double kans(int k)
    {
        double kans =  (double)binom(n, m) / ( (double)binom(m, k) * (double)binom(n - m, m - k) );
        return kans;
    }
    
}
