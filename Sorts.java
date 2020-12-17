import java.util.Arrays;

public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = 0; i < data.length; i++) {
      int swap = 0;
      for (int j = 0; j < data.length-1-i; j++) {
        int a = 0;
        if (data[j] > data[j+1]) {
          a = data[j+1];
          data[j+1] = data[j];
          data[j] = a;
          swap++;
        }
      }
      if (swap == 0) {
        i = data.length;
      }
    }
  }
}
