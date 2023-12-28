package org.example.dsa;

import java.util.Random;

public class MergeSort {

    public static void mergeSort(int[] arr) {

        int inputLength = arr.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = arr[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // merge
        merge(arr, leftHalf, rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k] = leftHalf[i];
                i++;
            } else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }


    private static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After:");
        printArray(numbers);
    }
}
