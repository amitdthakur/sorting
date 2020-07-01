package com.java.sorting.quicksort;

/**
 * Quick sort implementation in java with time complexity bigoh(n square) theta(nlogn)
 *
 * @author Sam, Amit
 */
public class QuickSortExample {

  /**
   * This function will return the partition index and shift the values which is lesser than the
   * pivot to left.
   *
   * @param inputInts  Input array.
   * @param startIndex Start index of array.
   * @param endIndex   End index of array
   * @return Partition index.
   */
  public static int partition(int[] inputInts, int startIndex, int endIndex) {
    // Picking right most element as pivot
    int pivot = inputInts[endIndex];
    int partitionIndex = startIndex;
    // If smaller element found then increment partition index
    for (int i = startIndex; i < endIndex; i++) {
      if (inputInts[i] <= pivot) {
        // Swap the element from position of i to partition index
        // As smaller elements should be on the left side of the partition
        int temp = inputInts[i];
        inputInts[i] = inputInts[partitionIndex];
        inputInts[partitionIndex] = temp;
        partitionIndex++;
      }
    }
    // Once all array scanned then swap pivot to the current position of partitionIndex
    int temp = inputInts[partitionIndex];
    inputInts[partitionIndex] = inputInts[endIndex];
    inputInts[endIndex] = temp;
    return partitionIndex;
  }


  public static void quickSort(int[] inputInts, int startIndex, int endIndex) {
    if (startIndex < endIndex) {
      // get the partitionIndex
      int partitionIndex = partition(inputInts, startIndex, endIndex);
      // Recursively call quick sort again with left and right sub list ignore pivot
      // (partitionIndex) as it should be on the right position.
      quickSort(inputInts, startIndex, partitionIndex - 1);
      quickSort(inputInts, partitionIndex + 1, endIndex);
    }
  }

}
