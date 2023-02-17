import javax.swing.*;

public class Lab5Program1 {

	public static void main(String[] args) {
	
		String isOrIsNot, inputWord;
		String name = args[0];
		TextFileInput in = new TextFileInput(name);
		String s;	
		int myArraySize = 1000;
		String[] wordArray = new String[myArraySize];
		s = in.readLine();
		int i = 0;
		while(s != null){
			wordArray[i]=s;
			s = in.readLine();
			i++;
		}
		inputWord = JOptionPane.showInputDialog(null,"Enter a word in all lower case:");
		if (wordIsThere(inputWord, wordArray)) 
		isOrIsNot = "is"; // set to is if the word is on the list
	else
		isOrIsNot = "is not"; // set to is not if the word is not on the list
	
	// Output to a JOptionPane window whether the word is on the list or not
	JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		} //main
		public static boolean wordIsThere(String findMe, String[] theList) {
			for (String string : theList) {
				
				if(string != null){if (string.equals(findMe)) {
					return true;
				}
			}}
			return false;
	
		}

} // class Lab5Program1