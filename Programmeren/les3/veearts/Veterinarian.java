import java.util.ArrayList;
/**
 * Write a description of class Veterinarian here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Veterinarian
{
    private String naam;
    private ArrayList<Animal> patients;
    
    public Veterinarian(String naam)
    {
        this.naam = naam;
        patients = new ArrayList<> ();
    }
    
    public void newPatient(Animal patient)
    {
        patients.add(patient);
    }
    
    public void printPatients()
    {
        for (Animal patient: patients)
        {
            System.out.println(patient.getName() + " van " + patient.getOwner());
        }
    }
    
    public int numberOfIllAnimals()
    {
        return patients.size();
    }
    
    public Animal getOldestIllAnimal()
    {
        Animal oudste = null;
        
        for (Animal a: patients)
        {
            if (oudste == null || a.isIll() && a.getAge() > oudste.getAge())
            {
                oudste = a;
            }
        }
        
        return oudste;
    }
}