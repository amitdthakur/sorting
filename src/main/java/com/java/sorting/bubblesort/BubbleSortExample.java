package com.java.sorting.bubblesort;

/**
 * Bubble sort example Time complexity (Worst) big oh(n2)
 *
 * @author Sam, Amit
 */
public class BubbleSortExample {

  /**
   * This function will sort the integer array.
   *
   * @param inputs Input array that need to sorted.
   */
  public static void bubbleSort(int[] inputs) {
    // We can pass the elements till n-1
    for (int i = 0; i < inputs.length - 1; i++) {
      // J start from 0 as comparison is from same loop
      // inputs.length - i - 1 as inner loop don't need to run till all time one less as higher
      // element move towards end of an array
      for (int j = 0; j < inputs.length - i - 1; j++) {
        if (inputs[j] > inputs[j + 1]) {
          int temp = inputs[j + 1];
          inputs[j + 1] = inputs[j];
          inputs[j] = temp;
        }
      }

    }
  }
}
