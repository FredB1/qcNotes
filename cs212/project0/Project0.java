import javax.swing.*;

/**
 * Project0
 */
public class Project0 {

  public static void main(String[] args) {
    while (true) {
      String input;
      String s1 = "stop";
      int[] count;
      input =
        JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
      count = countE(input);
      JOptionPane.showMessageDialog(
        null,
        "Number of lower case e's: " +
        count[0] +
        " \n" +
        "Number of lower case E's: " +
        count[1]
      );
      if (s1.equalsIgnoreCase(input)) System.exit(0);
    }
  }

  public static int[] countE(String s) {
    int[] count = { 0, 0 };
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'e') {
        count[0]++;
      } else if (s.charAt(i) == 'E') {
        count[1]++;
      }
    }
    return count;
  }
}
