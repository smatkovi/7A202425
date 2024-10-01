public class LKW extends Fahrzeug {
    private int anzahlAnhaenger;
    private int maxAnhaenger;

    // Konstruktor
    public LKW(double tankvolumen, double verbrauch, int maxAnhaenger) {
        super(tankvolumen, verbrauch);
        this.anzahlAnhaenger = 0;
        this.maxAnhaenger = maxAnhaenger;
    }

    // ... spezifische Methoden für LKWs
}