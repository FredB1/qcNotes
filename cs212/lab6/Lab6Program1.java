import javax.swing.*;

public class Lab6Program1 {

  public static void main(String[] args) {
    String name = args[0];
    TextFileInput in = new TextFileInput(name);
    String s;
    int myArraySize = 25;
    int[] wordArray = new int[myArraySize];
    s = in.readLine();
    int filled = 0;
    while (s != null) {
      wordArray[filled++] = Integer.parseInt(s);
      s = in.readLine();
    }
	int sum1 = sum(wordArray, myArraySize);
	float avg = average(wordArray, filled);
    JOptionPane.showMessageDialog(null, "The sum is  " + sum1 +"\n"+ "The average is  " + avg);

  } //main

  public static int sum(int[] myArray, int myArraySize) {
    int sum1 = 0;
    for (int i = 0; i < myArraySize; i++) {
      sum1 += myArray[i];
    }

    return sum1;
  }
  public static float average (int[] myArray, int myArraySize){
	int sum1 = sum(myArray, myArraySize);

	return (float)sum1/myArraySize;
  }
} // class Lab5Program1
