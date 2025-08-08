package mergeSort;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MergeSort {
  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[10];

    for(int i = 0; i < numbers.length; i++){
      numbers[i] = random.nextInt(1000000);
    }

    long startTime = System.nanoTime();
    mergeSort(numbers);

    long endTime = System.nanoTime();

    long duration = endTime - startTime;
    double durationSeconds = duration / 1_000_000_000.0;

    System.out.println("Time: " + durationSeconds + " seconds");
  }

  private  static void printArray(int[] array){
    for(int number : array){
      System.out.print(number + "\n");
    }
  }

  private static void mergeSort(int[] inputArray){
    // First create a length variable
    int inputArrayLength = inputArray.length;

    // arrays with a length of 1 are already sorted, so we chack the length first
    if(inputArrayLength == 1){
      return;
    }

    // Divide the array into two arrays
    var leftSide = inputArrayLength / 2;
    var rightSide = inputArrayLength - leftSide;

    // Now we populate the leftHalf with numbers from the input array


    // Populate the let half with numbers from the input array


    // Now we recursively call mergSort on our two halves

    // Finally merge
  }

  // Method to merge arrays
  private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){

    // This loop runs as long as both halves still have elements left.
    // Compares the current elements from leftHalf and rightHalf.
    // Takes the smaller one and puts it in inputArray.
    // Stops when one array is completely used up.


    // This runs if the left array still has leftovers after the first loop ends.
    // Copies all remaining left-side elements into the merged array.
    // This happens when all elements in rightHalf were smaller and got used up first.


    // This runs if the right array still has leftovers after the first loop ends.
    // Copies all remaining right-side elements.
    // This happens if leftHalf finished first.

  }
}


