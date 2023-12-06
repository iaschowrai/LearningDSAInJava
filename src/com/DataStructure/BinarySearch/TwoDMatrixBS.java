package com.DataStructure.BinarySearch;
import java.util.Arrays;
public class TwoDMatrixBS {
    public static void main(String[] args) {
        int[][] matrix = {{5, 12, 15, 18},
                          {19, 20, 22, 24},
                          {25, 27, 29, 30},
                            {31,32,34,35}};
        int target = 34;
        System.out.println(Arrays.toString(searchTgt(matrix, target)));

//        target = 12;
//        System.out.println(searchMatrix(matrix, target)); // Output: true
//
//        target = 13;
//        System.out.println(searchMatrix(matrix, target)); // Output: false
    }


    private static int[] searchTgt(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 0 || col == 0) {
            return new int[]{-1, -1}; // Matrix is empty
        }

        int rstart = 0;
        int rend = row - 1;

        while (rstart <= rend) {
            int mid = rstart + (rend - rstart) / 2;

            if (matrix[mid][0] <= target && matrix[mid][col -1] >= target) {
                return binarySearch(matrix, target, mid, 0, col - 1);
            } else if(matrix[mid][0] < target && matrix[mid][col -1] < target){
                rstart = mid + 1;
            }else{
                rend = mid -1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] binarySearch(int[][] matrix, int target, int row, int colStart, int colEnd) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid}; // Target found in the specified row
            } else if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1}; // Target not found in the specified row
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Convert 1D index 'mid' to 2D indices
            int rowIndex = mid / cols;
            int colIndex = mid % cols;

            int midValue = matrix[rowIndex][colIndex];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }


}
