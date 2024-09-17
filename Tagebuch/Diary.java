
/**
 * Beschreiben Sie hier die Klasse Diary.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.Arrays;
public class Diary
  {
    private String[] entries;
    public int currentIndex;
    public Diary(int numberOfEntries)
      {
        entries = new String[numberOfEntries];
        currentIndex = 0;
      }

    public void addEntry(String entry)
      {
        entries[currentIndex] = entry;
        currentIndex++;
      }

    public String getEntry(int index)
      {
        if (index >= 0 && index < entries.length)
          {
            return entries[index];
          }
        else
          {
            return null;
          }
      }

    public void printAllEntries()
      {
        System.out.println(Arrays.toString(entries));
      }
  }
