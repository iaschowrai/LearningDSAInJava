package com.DataStructure.BinarySearch;
// An interface representing a MountainArray with methods to get an element at an index and get the length of the array
interface MountainArray {
    int get(int index);

    int length();
}
// Example MountainArray implementation
class ExampleMountainArray implements MountainArray {
    private int[] array = {1, 2, 3, 4, 5, 3, 1};

    // Method to get an element at a specific index
    @Override
    public int get(int index) {
        return array[index];
    }

    // Method to get the length of the array
    @Override
    public int length() {
        return array.length;
    }
}

public class FindInMountainArrayLC {
    public static void main(String[] args) {
        // Target element to find in the mountain array
        int target = 1;

        // Example MountainArray implementation
        MountainArray mountainArray = new ExampleMountainArray();

        // Call the findInMountainArray function to find the target in the mountain array
        int result = findInMountainArray(target, mountainArray);

        // Print the result
        System.out.println("Index of " + target + ": " + result);
    }

    // Function to find an element in the mountain array
    private static int findInMountainArray(int target, MountainArray mountainArray) {
        // Find the index of the peak element in the mountain array
        int peakIndex = findPeakIndex(mountainArray);

        // Search in the increasing part of the array
        int increasingIndex = binarySearchIncreasing(target, mountainArray, 0, peakIndex);
        if (increasingIndex != -1) {
            return increasingIndex; // Return the index if found in the increasing part
        }

        // Search in the decreasing part of the array
        return binarySearchDecreasing(target, mountainArray, peakIndex + 1, mountainArray.length() - 1);
    }

    // Function to find the index of the peak element in the mountain array
    private static int findPeakIndex(MountainArray mountainArray) {
        int low = 0;
        int high = mountainArray.length() - 1;

        // Binary search to find the peak element
        while (low < high) {
            int mid = low + (high - low) / 2;

            // If the mid element is less than the next element, move to the right side of the array
            if (mountainArray.get(mid) < mountainArray.get(mid + 1)) {
                low = mid + 1;
            } else {
                // If the mid element is greater or equal to the next element, move to the left side
                high = mid;
            }
        }

        // Return the index of the peak element
        return low;
    }

    // Function to perform binary search in the increasing part of the mountain array
    private static int binarySearchIncreasing(int target, MountainArray mountainArray, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = mountainArray.get(mid);

            // If the target is found, return the index
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                // If mid element is less than the target, search in the right half
                low = mid + 1;
            } else {
                // If mid element is greater than the target, search in the left half
                high = mid - 1;
            }
        }

        // If the target is not found in the increasing part, return -1
        return -1;
    }

    // Function to perform binary search in the decreasing part of the mountain array
    private static int binarySearchDecreasing(int target, MountainArray mountainArray, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = mountainArray.get(mid);

            // If the target is found, return the index
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                // If mid element is less than the target, search in the left half
                high = mid - 1;
            } else {
                // If mid element is greater than the target, search in the right half
                low = mid + 1;
            }
        }

        // If the target is not found in the decreasing part, return -1
        return -1;
    }
}

