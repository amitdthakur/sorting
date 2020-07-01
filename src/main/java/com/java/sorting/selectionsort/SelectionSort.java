package com.java.sorting.selectionsort;

/**
 * Selection sort example Time complexity (Worst) big oh(n2)
 *
 * @author Sam, Amit
 */
public class SelectionSort {

  public static void selectionSort(int[] inputs) {
    // Running till second last element as till reaching last element everything will be sorted.
    for (int i = 0; i < inputs.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < inputs.length; j++) {
        // checking for minimum value in array
        if (inputs[j] < inputs[minIndex]) {
          minIndex = j;
        }
        // Swap value.
        int temp = inputs[minIndex];
        inputs[minIndex] = inputs[i];
        inputs[i] = temp;
      }
    }
  }


}
