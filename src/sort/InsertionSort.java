package sort;

import java.util.Arrays;

public class InsertionSort {

  // Сортировка вставкой. Скорость медленная O(n^2) применяеться в стандартной сортировке Java если елементов массива < 47
  public static void insertionSort(int[] array) {
    // начинаем со второго элемента, так как первый элемент уже находится в отсортированной части
    for (int i = 1; i < array.length; i++) {
      // запоминаем наш выбранный элемент в неотсортированной части
      int current = array[i];
      int j = i;
      /* сравниваем выбранный элемент с элементом неотсортированной части с права на лево
       * 1) [24] [42 (current), 2, 4, 42, 2, 1, 6]
       * 1) так как условие array[j - 1] > current не выполняется, остовляем его на месте
       * 2) i = 2 [24, 42] [2 (current), 4, 42, 2, 1, 6]
       * 2) условие выполняется поэтому 42 перемещаем впарво, и сравниваем current  с 24 -> условие
       * 2) также выполняется, поэтому 24 переносим также вправо
       */
      while (j > 0 && array[j - 1] > current) {
        array[j] = array[j - 1];
        j--;
      }
      // после 2-го прохода j = 0 после цикла while, поэтому 2 помещаем на 0 позицию
      array[j] = current;
    }
  }

  public static void main(String[] args) {

    int[] array = new int[]{24, 42, 2, 4, 42, 2, 1, 6};

    insertionSort(array);

    System.out.println(Arrays.toString(array));
  }

}
