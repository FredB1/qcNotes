import java.awt.GridLayout;
import javax.swing.*;

public class RomanANumeralGUI extends JFrame {

  public RomanANumeralGUI(
    String[] romanNumerals,
    int[] unsortedValues,
    int[] sortedValues,
    int count
  ) {
    setSize(600, 400);
    setLocationRelativeTo(null);
    setTitle("Roman Numeral Converter");

    // Check for null lists
    if (
      romanNumerals == null || unsortedValues == null || sortedValues == null
    ) {
      System.err.println("One or more lists are null");
      return;
    }

    // Create labels for each column
    JLabel romanNumeralLabel = new JLabel("Roman Numeral");
    JLabel unsortedValueLabel = new JLabel("Unsorted Value");
    JLabel sortedValueLabel = new JLabel("Sorted Value");

    // Create panel with labels and values
    JPanel panel = new JPanel(new GridLayout(count + 1, 3));
    panel.add(romanNumeralLabel);
    panel.add(unsortedValueLabel);
    panel.add(sortedValueLabel);

    for (int i = 0; i < romanNumerals.length; i++) {
      JLabel romanNumeralValue = new JLabel(romanNumerals[i]);
      JLabel unsortedValue = new JLabel(Integer.toString(unsortedValues[i]));
      JLabel sortedValue = new JLabel(Integer.toString(sortedValues[i]));
      panel.add(romanNumeralValue);
      panel.add(unsortedValue);
      panel.add(sortedValue);
    }
    //Add panels to frame
    add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
