
/**
 * Write a description of class Moeder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Moeder
{
    private Grootmoeder moeder;
    private Kind dochter;
    
    public Moeder(Grootmoeder moeder)
    {
        this.moeder = moeder;
        dochter = moeder.geefKleindochter();
    }
    
    public String geefFamilienaam()
    {
        return moeder.geefFamilienaam();
    }
}
