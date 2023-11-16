// Define a package for better organization
package com.DataStructure.BasicProblems;

// Define a class for finding missing numbers
public class MissingNumberFinder {

    // Private instance variable to store the array
    private int[] arr;

    // Constructor to initialize the array
    public MissingNumberFinder(int[] arr) {
        this.arr = arr;
    }

    // Getter method to retrieve the array
    public int[] getArr() {
        return arr;
    }

    // Setter method to update the array
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    // Method to find the missing number in the array
    public int findMissingNumber() {
        // Calculate the expected sum of numbers from 1 to (length + 1)
        int size = arr.length + 1;
        int sum = size * (size + 1) / 2;

        // Subtract each element in the array from the expected sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }

        // The remaining value in 'sum' is the missing number
        return sum;
    }

    // Main method to demonstrate the usage of the class
    public static void main(String[] args) {
        // Example array with a missing number
        int[] arr = {1, 2, 3, 4, 5, 6, 8};

        // Create an instance of MissingNumberFinder
        MissingNumberFinder finder = new MissingNumberFinder(arr);

        // Find and print the missing number
        int missingNumber = finder.findMissingNumber();
        System.out.println("Missing number: " + missingNumber);
    }
}
