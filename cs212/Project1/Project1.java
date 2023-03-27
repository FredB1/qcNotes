import java.util.*;

import Project1.RomanANumeralGUI;
import Project1.TextFileInput;

public class Project1 {
    public static TextFileInput myFile;
    public static StringTokenizer myTokens;
    public static String line;
    public static String[] nums;

    public static void main(String[] args) {
        myFile = new TextFileInput("./input.txt");
        line = myFile.readLine();
        String[] nums = new String[10];
        int i = 0;
        while (line != null) {
            myTokens = new StringTokenizer(line, ",");
            while (myTokens.hasMoreTokens()) {
                nums[i] = myTokens.nextToken();
                i++;
            }
            line = myFile.readLine();
        }
        int[] newArr = new int[i];
        for (int j = 0; j < i; j++) {
            if (nums[j] != null) {
                newArr[j] = valRoman(nums[j]);
            }
        }
        RomanANumeralGUI frame = new RomanANumeralGUI(nums, newArr, i);
        frame.setVisible(true);
    }

    public static int valueOf(String s) {
        int num = 0;
        if (s.equals("I"))
            num = 1;
        if (s.equals("V"))
            num = 5;
        if (s.equals("X"))
            num = 10;
        if (s.equals("L"))
            num = 50;
        if (s.equals("C"))
            num = 100;
        if (s.equals("D"))
            num = 500;
        if (s.equals("M"))
            num = 1000;
        return num;
    }

    public static int valRoman(String s) {
        int total = 0;
        String[] temp = s.split("");
        int[] values = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            values[i] = valueOf(temp[i]);
        }
        for (int i = 0; i < values.length; i++) {
            if (i < values.length - 1) {
                total = (values[i] >= values[i + 1]) ? total + values[i] : total - values[i];
            } else {
                total += values[i];
            }
        }
        return total;
    }
}
