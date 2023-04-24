import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class FileMenuHandler implements ActionListener {
   JFrame jframe;

   public FileMenuHandler(JFrame jf) {
      jframe = jf;
   }

   public void actionPerformed(ActionEvent event) {
      String menuName;
      menuName = event.getActionCommand();
      if (menuName.equals("Open"))
         openFile();
      else if (menuName.equals("Quit"))
         System.exit(0);
   }

   private void openFile() {
      JFileChooser chooser;
      int status;
      chooser = new JFileChooser();
      status = chooser.showOpenDialog(null);
      if (status == JFileChooser.APPROVE_OPTION)
         readSource(chooser.getSelectedFile());
      else
         JOptionPane.showMessageDialog(null, "Open File dialog canceled");
   }

   private void readSource(File chosenFile) {
      Scanner inFile = null;
      try {
          inFile = new Scanner(chosenFile);
          Container myContentPane = jframe.getContentPane();
          TextArea myTextArea = new TextArea();
          TextArea mySubscripts = new TextArea();
          myContentPane.add(myTextArea, BorderLayout.EAST);
          myContentPane.add(mySubscripts, BorderLayout.WEST);
  
          while (inFile.hasNextLine()) {
              String line = inFile.nextLine();
              String[] romanNumerals = line.split(",|\n");
  
              for (String ssn : romanNumerals) {
                  RomanNumeral romanNumeral = new RomanNumeral(ssn);
                  int convertedValue = romanNumeral.getNum();
                  mySubscripts.append(ssn + "\n");
                  myTextArea.append(Integer.toString(convertedValue) + "\n");
              }
          }
          jframe.setVisible(true);
      } catch (FileNotFoundException e) {
          JOptionPane.showMessageDialog(null, "File not found");
      } catch (IllegalRomanNumeralException e) {
          JOptionPane.showMessageDialog(null, "Invalid Roman numeral: " + e.getMessage());
      } finally {
          if (inFile != null) {
              inFile.close();
          }
      }
  }  
}
