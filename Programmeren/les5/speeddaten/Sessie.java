import java.util.ArrayList;
import java.util.Random;

public class Sessie {

    private ArrayList<Kandidaat> kandidaten;
    private static final Random RG = new Random();

    public Sessie() {
        int aantal = 30; // later: willekeurig aantal deelnemers tussen 10 en 30 (30 inbegrepen).
        kandidaten = new ArrayList<>();
        for(int i=0; i<aantal; i++) {
            boolean isVrouw = RG.nextInt(2)%2==0; // later: willekeurig
            kandidaten.add(new Kandidaat(isVrouw));
        }
    }

    public void doeSessie(boolean interesseInVrouwen, boolean interesseInMannen) {
        // Print kandidaten en verwijder ongeschikte.
        // Hier aanvullen!
        int index = 0;
        boolean supermatch = false;

        while (index < kandidaten.size() && !supermatch)
        {
            double match = bepaalMatch(kandidaten.get(index), interesseInVrouwen, interesseInMannen);

            System.out.println(kandidaten.get(index).getNaam() + ": " + match);

            if (match > 0.9)
            {
                supermatch = true;
                System.out.println(">>SUPERMATCH");
                System.out.println(kandidaten.get(index).getNaam());
            }
            else if (match < 0.5)
            {
                kandidaten.remove(index);
            } else
            {
                index++;
            }
        }

        if (!supermatch)
        {
            // Print de resterende kandidaten.
            System.out.println(">> Geschikte kandidaten:");
            for(Kandidaat kandidaat: kandidaten){
                System.out.println(kandidaat.getNaam());
            }

        }

        System.out.println();
    }

    private double bepaalMatch(Kandidaat kandidaat, boolean interesseInVrouwen, boolean interesseInMannen){
        double match = 0.0;
        if(kandidaat.isVrouw() && interesseInVrouwen || kandidaat.isVrouw() && interesseInMannen) {
            match = RG.nextDouble(); // later: willekeurig kommagetal tussen 0 en 1 (1 niet inbegrepen)
        }
        
        return match;
    }

}
