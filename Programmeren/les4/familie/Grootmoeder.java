
/**
 * Write a description of class Grootmoeder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grootmoeder
{
    private String familienaam;
    private Moeder dochter;
    private Kind kleindochter;
    
    public Grootmoeder(String familienaam)
    {
        this.familienaam = familienaam;
        dochter = new Moeder(this);
        kleindochter = new Kind(dochter);
    }
    
    public String geefFamilienaam()
    {
        return familienaam;
    }
    
    public Moeder geefDochter()
    {
        return dochter;
    }
    
    public Kind geefKleindochter()
    {
        return kleindochter;
    }
}
