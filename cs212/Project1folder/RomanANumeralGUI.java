import javax.swing.*;
import java.awt.GridLayout;

public class RomanANumeralGUI extends JFrame {
    public RomanANumeralGUI(String[] roman, int[] values, int count) {
        setSize(400, 200);
        setLocation(100, 100);
        setTitle("Roman Numerals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        JPanel leftPanel = new JPanel(new GridLayout(count, 1));
        JPanel rightPanel = new JPanel(new GridLayout(count, 1));

        // Loop through the arrays and create JLabels to display the values
        for (int i = 0; i < count; i++) {
            JLabel romanLabel = new JLabel(roman[i]);
            JLabel valueLabel = new JLabel(String.valueOf(values[i]));
            leftPanel.add(romanLabel);
            rightPanel.add(valueLabel);
        }

        // Add the panels to the JFrame
        add(leftPanel);
        add(rightPanel);
    }
}