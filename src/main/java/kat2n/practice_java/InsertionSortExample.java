package main.java.kat2n.practice_java;

public class InsertionSortExample {

  public static void insertionSort(int[] array) {
    for (int j = 1; j < array.length; j++) {
      int key = array[j];
      int i = j - 1;
      while ((i >= 0) && (array[i] > key)) {
        array[i + 1] = array[i];
        i--;
      }
      array[i + 1] = key;
    }
  }

  public static void main(String[] args){
    int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
    System.out.println("Before Insertion Sort");
    for (int i : arr1) {
      System.out.print(i + " ");
    }
    System.out.println();
    insertionSort(arr1);
    System.out.println("After Insertion Sort");
    for (int i : arr1) {
      System.out.print(i + " ");
    }
  }

}
