public class PKW extends Fahrzeug
  {
    private int zugelassenePersonen;
    private boolean metallicLack;
    private boolean fensterOffen;
    public PKW(double tankvolumen, double verbrauch, int zugelassenePersonen)
      {
        super(tankvolumen, verbrauch);
        this.zugelassenePersonen = zugelassenePersonen;
        this.metallicLack = false;
        this.fensterOffen = false;
      }
  }

