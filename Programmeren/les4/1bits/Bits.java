import java.util.ArrayList;
/**
 * Write a description of class Bits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bits
{
    public int aantal1Bits (int getal)
    {
        int aantal = 0;

        while (getal > 0)
        {
            aantal += getal%2;
            getal /= 2;
        }

        return aantal;
    }
    
    public int aantalAs(String str)
    {
        int index = str.indexOf("a");
        int aantal = 0;
        
        while (index >= 0)
        {
            index = str.indexOf("a", index + 1);
            aantal++;
        }
        
        return aantal;
    }
    
    public ArrayList<String> verwijderStrings (ArrayList<String> lst)
    {
        int index = 0;
        
        while (index < lst.size())
        {
            if (lst.get(index).length() < 4)
            {
                lst.remove(index);
                continue;
            }
            
            index++;
        }
        
        return lst;
    }
    
    public void printAs(int aantal)
    {
        String str = "";
        
        for (int i = 1; i <= aantal; i++)
        {
            str += "a";
            System.out.println(str);
        }
    }
    
    public int somTotEnMet(int n)
    {
        int totaal = 0;
        for (int i = 0; i <= n; i++)
        {
            totaal += i;
        }
        
        return totaal;
    }
    
    public void print(ArrayList<String> lst)
    {
        for (int i = 0; i < lst.size(); i++)
        {
            System.out.println(i + 1 + ". " + lst.get(i));
        }
    }
    
    public double reekssom (double x)
    {
        double totaal = 0;
        for (int i = 1; i <= 6; i++)
        {
            totaal += i*x;
            x *= x;
        }
        
        return totaal;
    }
}
