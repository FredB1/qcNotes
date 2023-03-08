package lab8;

import java.util.*;

/*
 * This application demonstrates the use of a StringTokenizer.
 * It will open a file, read a line with tokens separated by commas,
 * declare an array whose size is equal to the number of the tokens, 
 * extract each token one by one from the tokenized String and
 * store each string in an array.
 */
public class Tokens {
   public static TextFileInput myFile;
   public static StringTokenizer myTokens;
   public static String animal;
   public static String[] animals;
   public static String line;

   public static void main(String[] args) {
      /*
       * Open the file and read a line
       */
      myFile = new TextFileInput("lab8/ twodimension8.txt");
      line = myFile.readLine();
      System.out.println("The input line is " + line);
      /*
       * Create a new StringTokenizer, passing the String and the delimeter (",")
       */
      myTokens = new StringTokenizer(line, ",");
      System.out.println("There are " + myTokens.countTokens() + " tokens in the line.");
      /*
       * Declare an array whose size is equal to the number of tokens found
       * using the method countTokens from the StringTokenizer class
       */
      animals = new String[myTokens.countTokens()];
      /*
       * Get the separated strings one by one from the StringTokenizer and put
       * them in the array
       */
      int i = 0;
      while (myTokens.hasMoreTokens()) {
         animals[i] = myTokens.nextToken();
         i++;
      }
      /*
       * Print the array
       */
      int[][] gridd = new int[Integer.parseInt(animals[0])][Integer.parseInt(animals[1])];

      for (int j = 0; j < Integer.parseInt(animals[0]); j++) {
         line = myFile.readLine();
         myTokens = new StringTokenizer(line, ",");
         for (int j2 = 0; j2 < Integer.parseInt(animals[1]); j2++) {
            gridd[j][j2] = Integer.parseInt(myTokens.nextToken());
         }
      }
      for (int i1 = 0; i1 < Integer.parseInt(animals[0]); i1++) {
         for (int j = 0; j < Integer.parseInt(animals[1]); j++) {
            System.out.print(gridd[i1][j] + " ");
         }
         System.out.println();
      }
   } // main

} // Tokens
