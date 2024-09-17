
/**
 * Beschreiben Sie hier die Klasse Scan.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */


import java.util.Scanner;
     
public class Scan
  {
    public static void Main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein und drücken Sie ENTER:");
        String input = scanner.nextLine();

        System.out.println("\n" + "Ihr Text: " + input);
      }
  }
