package com.java.sorting;

import com.java.sorting.quicksort.QuickSortExample;

/**
 * Hello world!
 */
public class App {

  /**
   * Main function of the java class.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    int[] ints = {6, 5, 3, 2, 4};
    QuickSortExample.quickSort(ints, 0, ints.length - 1);
    for (int i = 0; i < ints.length; i++) {
      System.out.println(ints[i]);
    }

  }
}
