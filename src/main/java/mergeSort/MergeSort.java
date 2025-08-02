package mergeSort;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MergeSort {
  public static void main(String[] args) {
    Random random = new Random();
    int [] numbers = new int[100000000];

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
    int arrayLength = inputArray.length;

    // arrays with a length of 1 are already sorted, so we chack the length first
    if(arrayLength < 2){
      return;
    }

    // Divide the array into two arrays
    int midIndex = arrayLength / 2;
    int[] leftHalf = new int[midIndex];
    int[] rightHalf = new int [arrayLength - midIndex];

    // Now we populate the leftHalf with numbers from the input array
    for(int i = 0 ; i < midIndex ; i++){
      leftHalf[i] = inputArray[i];
    }

    // Populate the let half with numbers from the input array
    for(int i = midIndex; i < arrayLength; i++){
      rightHalf[i - midIndex] = inputArray[i];
    }

    // Now we recursively call mergSort on our two halves
    mergeSort(leftHalf);
    mergeSort(rightHalf);

    // Finally merge
    merge(inputArray, leftHalf, rightHalf);
  }

  // Method to merge arrays
  private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
    int leftSize = leftHalf.length;
    int rightSize = rightHalf.length;

    int i = 0, j = 0,  k = 0;

    // This loop runs as long as both halves still have elements left.
    // Compares the current elements from leftHalf and rightHalf.
    // Takes the smaller one and puts it in inputArray.
    // Stops when one array is completely used up.
    while(i < leftSize && j < rightSize){
      if(leftHalf[i] <= rightHalf[j]){
        inputArray[k] = leftHalf[i];
        i++;
      }
      else{
        inputArray[k] = rightHalf[j];
        j++;
      }
      k++;
    }


    // This runs if the left array still has leftovers after the first loop ends.
    // Copies all remaining left-side elements into the merged array.
    // This happens when all elements in rightHalf were smaller and got used up first.
    while(i < leftSize){
      inputArray[k] = leftHalf[i];
      i++;
      k++;
    }

    // This runs if the right array still has leftovers after the first loop ends.
    // Copies all remaining right-side elements.
    // This happens if leftHalf finished first.
    while(j < rightSize){
      inputArray[k] = rightHalf[j];
      j++;
      k++;
    }
  }
}


