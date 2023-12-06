package com.DataStructure.BinarySearch;

import java.util.Arrays;

public class TwoDMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{5, 12, 15, 18},
                {10, 16, 17, 19},
                {14, 20, 21, 25}};

        int target = 25;

        System.out.println(Arrays.toString(twoDiMatrix(matrix, target)));
    }

    public static int[] twoDiMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
