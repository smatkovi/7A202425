public class Fahrzeug {
    private float tankvolumen;
    private float tankinhalt;
    private float kilometerstand;
    private float verbrauch;

    // Konstruktor
    public Fahrzeug(float tankvolumen, float verbrauch) {
        this.tankvolumen = tankvolumen;
        this.tankinhalt = 0;
        this.kilometerstand = 0;
        this.verbrauch = verbrauch;
    }

    // Getter und Setter
    public float getTankvolumen() {
        return tankvolumen;
    }

    // ... andere Getter und Setter

    public boolean fahren(float kilometer) {
        // Berechne den benötigten Kraftstoff und überprüfe, ob genug vorhanden ist
        float benotigterKraftstoff = kilometer * verbrauch / 100;
        if (benotigterKraftstoff <= tankinhalt) {
            tankinhalt -= benotigterKraftstoff;
            kilometerstand += kilometer;
            return true;
        } else {
            System.out.println("Nicht genug Kraftstoff!");
            return false;
        }
    }

    public boolean tanken(float liter) {
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

