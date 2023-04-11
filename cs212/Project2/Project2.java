import java.util.*;

public class Project2 {

  public static TextFileInput myFile;
  public static StringTokenizer myTokens;
  public static String line;
  public static String[] nums;

  public static void main(String[] args) {
    myFile = new TextFileInput("./input.txt");
    line = myFile.readLine();
    UnsortedRomanNumeralList unsortedList = new UnsortedRomanNumeralList();
    SortedRomanNumeralList sortedList = new SortedRomanNumeralList();

    // Create an array to hold the Roman numerals
    nums = new String[100];
    int count = 0;

    while (line != null) {
      myTokens = new StringTokenizer(line, ",");
      while (myTokens.hasMoreTokens()) {
        String romanString = myTokens.nextToken();
        RomanNumeral romanNumeral = new RomanNumeral(romanString);

        // Add the Roman numeral to the arrays
        nums[count] = romanString;
        count++;

        unsortedList.append(romanNumeral);
        sortedList.add(romanNumeral);
      }
      line = myFile.readLine();
    }
    int[] unsortedValues = new int[unsortedList.getLength()];
    int[] sortedValues = new int[sortedList.getLength()];
    for (int i = 0; i < unsortedList.getLength(); i++) {
      unsortedValues[i] = unsortedList.get(i).getNum();
      sortedValues[i] = sortedList.get(i).getNum();
    }
    String[] nums = new String[unsortedValues.length];
    for (int i = 0; i < unsortedValues.length; i++) {
      nums[i] = unsortedList.get(i).getNumeral();
    }
    //Create frame and make it visible

    RomanANumeralGUI frame = new RomanANumeralGUI(
      nums,
      unsortedValues,
      sortedValues,
      unsortedList.getLength()
    );
    frame.setVisible(true);
  }
}
