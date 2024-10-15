
/**
 * Write a description of class Dochter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kind
{
    private Moeder moeder;
    
    public Kind(Moeder moeder)
    {
        this.moeder = moeder;
    }
    
    public String geefFamilienaam()
    {
        return moeder.geefFamilienaam();
    }
}