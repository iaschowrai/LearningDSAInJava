package com.DataStructure.BinarySearch;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ascArr = {21,19,16,14,12,11,8,5,3,1};
        int key = 1;

        int indexAsc = agnosticBinarySearch(ascArr, key);
        int indexDesc = agnosticBinarySearch(ascArr, key);

        System.out.println("Index in Ascending Order: " + indexAsc);
        System.out.println("Index in Descending Order: " + indexDesc);
    }

    private static int agnosticBinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] <= arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Element not found
    }
}
