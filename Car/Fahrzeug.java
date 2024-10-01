public class Fahrzeug {
    private double tankvolumen;
    private double tankinhalt;
    private double kilometerstand;
    private double verbrauch;

    // Konstruktor
    public Fahrzeug(double tankvolumen, double verbrauch) {
        this.tankvolumen = tankvolumen;
        this.tankinhalt = 0;
        this.kilometerstand = 0;
        this.verbrauch = verbrauch;
    }

    // Getter und Setter
    public double getTankvolumen() {
        return tankvolumen;
    }

    // ... andere Getter und Setter

    public boolean fahren(double kilometer) {
        // Berechne den benötigten Kraftstoff und überprüfe, ob genug vorhanden ist
        double benotigterKraftstoff = kilometer * verbrauch / 100;
        if (benotigterKraftstoff <= tankinhalt) {
            tankinhalt -= benotigterKraftstoff;
            kilometerstand += kilometer;
            return true;
        } else {
            System.out.println("Nicht genug Kraftstoff!");
            return false;
        }
    }

    public boolean tanken(double liter) {
        // Überprüfe, ob der Tank überläuft
        if (tankinhalt + liter <= tankvolumen) {
            tankinhalt += liter;
            return true;
        } else {
            System.out.println("Tank läuft über!");
            return false;
        }
    }

    // ... weitere Methoden, z.B. zur Anzeige von Fahrzeugdaten
}

