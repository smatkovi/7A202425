
/**
 * Beschreiben Sie hier die Klasse Ternary.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Scanner;

public class Ternary  
  {
    public static void main(String[] args)
      {
        int zahl = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Zahl ein und drücken Sie ENTER:");
        String input = scanner.nextLine();
        zahl = Integer.parseInt(input);
        String ergebnis = (zahl % 2 == 0) ? "Die Zahl ist gerade" : "Die Zahl ist ungerade";
        System.out.println(ergebnis);
      }
  }
