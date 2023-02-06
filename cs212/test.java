/**
 * test
 */
public class test {

  public static void main(String[] args) {
    int arry[] = { 7, 78, 77, 89, 9, 11, 100 };
    selectionSort(arry);
    for (int i : arry) {
      System.out.println(i);
    }
  }

  private static void selectionSort(int[] arry) {
    for (int i = 0; i < arry.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arry.length; j++) {
        if (arry[min] < arry[j]) {
          min = j;
        }
      }
      int temp = arry[i];
      arry[i] = arry[min];
      arry[min] = temp;
    }
  }
}
