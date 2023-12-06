package com.DataStructure.BinarySearch;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {2,11,9,8,7,3,11};
        int ascResult = peakMountain(arr);
        System.out.println("Peak Mountain found at index: " + ascResult);
    }

    private static int peakMountain(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
//  Important condition to check for next move of mid. the important concept of peakmountain is
//            finding the peak element in the array, the mid -1 < mid > mid +1
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
