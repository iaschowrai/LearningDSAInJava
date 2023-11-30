package com.DataStructure.BinarySearch;

public class FindMountainArray {
    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 5, 3, 1};
        int target = 1;
        int result = findMountainArray(arr, target);
        System.out.println("target located at index: " + result);
    }

    private static int findMountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int peakIndex = peakMountainArray(arr,  start, end);

        int firstTry =  ascendingOrder(arr,target,start,peakIndex);
        if(firstTry != -1){
            return ascendingOrder(arr,target,start,peakIndex);
        }
        return descendingOrder(arr,target,peakIndex, end);
    }

    private static int ascendingOrder(int[] arr, int target, int start, int peakIndex) {
        while (start <= peakIndex){
            int mid = start = (peakIndex - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target){
                peakIndex = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    private static int descendingOrder(int[] arr, int target, int peakIndex, int end) {
        while (peakIndex <= end){
            int mid = peakIndex + (end - peakIndex) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] > target){
                peakIndex = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int peakMountainArray(int[] arr, int start, int end) {
        while (start <= end){
            int mid = start + (end - start) / 2;

            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
