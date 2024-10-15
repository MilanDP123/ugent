
/**
 * Write a description of class Bier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bier
{
    private String naam;
    private double alcoholpercentage;
    private String stad;
    
    public Bier(String naam, double alcoholpercentage, String stad)
    {
        this.naam = naam;
        this.alcoholpercentage = alcoholpercentage;
        this.stad = stad;
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public double getAlcoholpercentage()
    {
        return alcoholpercentage;
    }
    
    public String getStad()
    {
        return stad;
    }
    
    public void print()
    {
        System.out.println(naam + "\t alcoholpercentage: " + alcoholpercentage + "% \t" + "oorsprong: " + stad);
    }
}
