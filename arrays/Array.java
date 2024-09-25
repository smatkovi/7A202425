
/**
 * Beschreiben Sie hier die Klasse For.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Array
{
  public static void main(String[] args)  
    {
      int[] lottozahlen = new int[6];
      System.out.println("nu");

      for(int i=0; i<6; i++)
        {
          boolean unique = true;
          
          //while(unique)
          //  {
          //    System.out.println("u");
          //    int rn = (int)((Math.random() * 45) + 1);
          //    for(int lottozahl: lottozahlen)
          //      if(lottozahl == rn) unique = false;
          //    if(unique)
          //      {
          //        lottozahlen[i] = rn;
          //        unique = false;
          //      }
          //    else unique = true;
          //  }
          int rn = (int)((Math.random() * 45) + 1);
          lottozahlen[i] = rn;
        }

      //for(int i=0; i<6; i++) System.out.println(lottozahlen[i]);
      System.out.println(" ");
      
      for(int zahl: lottozahlen) System.out.println(zahl + " ");
    }
}
