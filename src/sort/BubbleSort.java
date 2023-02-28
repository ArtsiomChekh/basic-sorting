package sort;

import java.util.Arrays;

public class BubbleSort {

  // сортировка пузырьком. Скорость медленная O(n^2)
  public static void bubbleSort(int[] array) {

    /* сравниваем два соседних элемента и меняем их местами(если первый больше второго) -> тем самым
     * перегоняем самый большой элемент в правую сторону, при следующем проходе i, мы сокращаем длину
     * обхода на 1 (так последний элемент уже на своем месте, он самый большой)
     */
    for (int i = 0; i < array.length - 1; i++) {
      int temp;

      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {

    int[] array = new int[]{24, 42, 2, 4, 42, 2, 1, 6};

    bubbleSort(array);

    System.out.println(Arrays.toString(array));

  }

}
