package com.DataStructure.LinearSearch;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 7, 2, 9, 8};
        int key = 17;
        SearchResult result = lSearch(arr, key);

        if (result.index != -1) {
            System.out.println("Element " + key + " found at index " + result.index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }

    private static SearchResult lSearch(int[] arr, int target) {
        SearchResult result = new SearchResult();

        if (arr.length == 0) {
            result.index = -1;
            return result;
        }

        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]) {
                result.index = index;
                return result;
            }
        }

        result.index = -1;
        return result;
    }

    private static class SearchResult {
        int index;
    }
}

