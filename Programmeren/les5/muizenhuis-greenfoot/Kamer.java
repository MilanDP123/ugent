public class Kamer {
    private Lamp lamp;
    private int aantal;
    public Kamer(Lamp lamp, int aantal) {
        this.lamp = lamp;
        this.aantal = aantal;
    }
    
    public void vermeerderMuizen() {
        aantal++;
        lamp.lampAan();
    }
    
    public void verminderMuizen() {
        aantal--;
        if (aantal == 0)
        {
            lamp.lampUit();
        }
    }
}
