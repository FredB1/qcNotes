import javax.swing.*;
import java.awt.*;

public class RomanNumeralGUI extends JFrame {

    public RomanNumeralGUI() {
        setTitle("Roman Numeral Converter");
        setSize(600, 400);
        setLocationRelativeTo(null);

        createMenus();

        // Set background color
        getContentPane().setBackground(Color.CYAN);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createMenus() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create File menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        openItem.addActionListener(new FileMenuHandler(this));

        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        quitItem.addActionListener(new FileMenuHandler(this));

        // Create Convert menu
        JMenu convertMenu = new JMenu("Convert");
        menuBar.add(convertMenu);

        JMenuItem romanToArabicItem = new JMenuItem("Roman to Arabic");
        convertMenu.add(romanToArabicItem);
        romanToArabicItem.addActionListener(new ConvertMenuHandler(this));

        // Customize menu items
        openItem.setBackground(Color.YELLOW);
        openItem.setFont(new Font("Arial", Font.BOLD, 14));

        quitItem.setBackground(Color.YELLOW);
        quitItem.setFont(new Font("Arial", Font.BOLD, 14));

        romanToArabicItem.setBackground(Color.YELLOW);
        romanToArabicItem.setFont(new Font("Arial", Font.BOLD, 14));
    }
}
