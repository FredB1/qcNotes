import javax.swing.JOptionPane;

public class Q3 {
    public static void main(String[] args) {
        int count = 0;
        String s = JOptionPane.showInputDialog(null,"Enter your string");
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "There are "+ count+ " digits in the string.");
    }
}
