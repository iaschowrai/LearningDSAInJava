package com.DataStructure.BasicProblems;

import java.util.Arrays;

public class RemoveEvenIntegers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenInt(arr);
    }

    // Corrected method name to follow Java conventions (camelCase)
    public static void removeEvenInt(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }

        // Creating an array with the same length as the oddCounts
        int[] result = new int[oddCount];

        // Use index variable to track the position in the result array
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                // If the number is odd, add it to the result array and increment index
                result[index] = arr[i];
                index++;
            }
        }

        // Print the count of odd numbers
        System.out.println("Count of odd numbers: " + oddCount);

        // Print the result array using Arrays.toString() method
        System.out.println("Result array: " + Arrays.toString(result));
    }
}
