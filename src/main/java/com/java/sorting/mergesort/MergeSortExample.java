package com.java.sorting.mergesort;

/**
 * Quick sort implementation in java with time complexity bigoh(nlogn)
 *
 * @author Sam, Amit
 */
public class MergeSortExample {


  public static void merge(int[] left, int[] right, int[] main) {
    int i = 0, j = 0, k = 0;
    int leftArraySize = left.length;
    int rightArraySize = right.length;
    // check for minimum element in both if found then add to main array
    while (i < leftArraySize && j < rightArraySize) {
      if (left[i] < right[j]) {
        main[k] = left[i];
        i = i + 1;
      } else {
        main[k] = right[j];
        j = j + 1;
      }
      k = k + 1;
    }
    // take care of remaining elements in left
    while (i < leftArraySize) {
      main[k] = left[i];
      i = i + 1;
      k = k + 1;
    }
    // take care of remaining elements in left
    while (j < rightArraySize) {
      main[k] = right[j];
      j = j + 1;
      k = k + 1;
    }
  }

  public static void mergeSort(int[] array) {
    int length = array.length;
    // Exit condition if array containing single element the stop
    if (length < 2) {
      return;
    }
    int mid = length / 2;
    int[] left = new int[mid];
    int[] right = new int[length - mid];
    // fill left array
    for (int i = 0; i < mid; i++) {
      left[i] = array[i];
    }
    // fill right array
    for (int j = mid; j < length; j++) {
      right[j - mid] = array[j];
    }
    // call merge sort on left
    mergeSort(left);
    // call merge sort on right
    mergeSort(right);
    // call merge function for merging into main array
    merge(left, right, array);
  }

}
