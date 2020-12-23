import java.util.Arrays;

public class Sorts{

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

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i++) {
      int smallest = i;
      for (int j = i; j < data.length; j++) {
        if (data[j] < data[smallest]) {
          smallest = j;
        }
      }
      int a = data[i];
      data[i] = data[smallest];
      data[smallest] = a;
    }
  }

}
