package com.DataStructure.BinarySearch;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = { 9, 0, 1, 2,3, 4, 6, 7, 8};
        int target = 0;
        int result = findRotatedArray(arr, target);
        System.out.println("Index of " + target + "   located at : " + result);
    }

    private static int findRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = findPivot(arr, start, end);
        System.out.println("Pivot located at index: " + pivot);
        // Check which half to search
        if (pivot == -1) {
            return binarySearch(arr, target, start, end);
        } else if (arr[pivot] == target) {
            return pivot;
        } else if (arr[start] <= target && target <= arr[pivot - 1]) {
            return binarySearch(arr, target, start, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, end);
        }
    }

    private static int findPivot(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > start && arr[mid - 1] > arr[mid]) {
                // If the element at mid is smaller than the element before it,
                // then mid - 1 is the pivot.
                return mid - 1;
            } else if (mid < end && arr[mid] > arr[mid + 1]) {
                // If the element at mid is greater than the element after it,
                // then mid is the pivot.
                return mid;
            } else if (arr[start] >= arr[mid]) {
                // If the element at start is greater than or equal to the element at mid,
                // the pivot must be in the left half.
                end = mid - 1;
            } else {
                // Otherwise, the pivot must be in the right half.
                start = mid + 1;
            }
        }
        return -1; // No pivot found.
    }


    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
//
//      easy way to solve in one method
//    private static int search(int[] nums, int target) {
//        int low = 0;
//        int high = nums.length - 1;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if (nums[mid] == target) {
//                return mid; // Found the target
//            }
//
//            // Check if the left half is sorted
//            if (nums[low] <= nums[mid]) {
//                // Check if the target is in the left half
//                if (nums[low] <= target && target < nums[mid]) {
//                    high = mid - 1; // Search in the left half
//                } else {
//                    low = mid + 1; // Search in the right half
//                }
//            } else {
//                // Check if the target is in the right half
//                if (nums[mid] < target && target <= nums[high]) {
//                    low = mid + 1; // Search in the right half
//                } else {
//                    high = mid - 1; // Search in the left half
//                }
//            }
//        }
//
//        return -1; // Target not found
//    }


// with duplicates

// while (low <= high) {
//         int mid = low + (high - low) / 2;
//
//         if (nums[mid] == target) {
//         return mid; // Found the target
//         }
//
//         // Check if the left half is sorted
//         if (nums[low] < nums[mid] || nums[mid] > nums[high]) {
//        // Check if the target is in the left half
//        if (nums[low] <= target && target < nums[mid]) {
//        high = mid - 1; // Search in the left half
//        } else {
//        low = mid + 1; // Search in the right half
//        }
//        } else if (nums[low] > nums[mid] || nums[mid] < nums[high]) {
//        // Check if the target is in the right half
//        if (nums[mid] < target && target <= nums[high]) {
//        low = mid + 1; // Search in the right half
//        } else {
//        high = mid - 1; // Search in the left half
//        }
//        } else {
//        // Handle duplicates: Move both pointers inward
//        low++;
//        high--;
//        }
//        }
//
//        return -1; // Target not found
//        }