public class LKW extends Fahrzeug
  {
    private int anzahlAnhaenger;
    private int maxAnhaenger;
    public LKW(double tankvolumen, double verbrauch, int maxAnhaenger)
      {
        super(tankvolumen, verbrauch);
        this.anzahlAnhaenger = 0;
        this.maxAnhaenger = maxAnhaenger;
      }
  }