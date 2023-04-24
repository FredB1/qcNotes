import javax.swing.*;
import java.awt.event.*;

public class ConvertMenuHandler implements ActionListener {
    JFrame jframe;

    public ConvertMenuHandler(JFrame jf) {
        jframe = jf;
    }

    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Roman to Arabic")) {
            String romanInput = JOptionPane.showInputDialog(jframe, "Enter a Roman numeral:");
            if (romanInput != null && !romanInput.trim().isEmpty()) {
                try {
                    RomanNumeral romanNumeral = new RomanNumeral(romanInput);
                    int arabicValue = romanNumeral.getNum();
                    JOptionPane.showMessageDialog(jframe, "The Arabic value is: " + arabicValue);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(jframe, "Invalid Roman numeral entered: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(jframe, "No Roman numeral entered.");
            }
        }
    }
}
