package com.DataStructure.Easy;

import java.util.Arrays;

public class FindEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int res = findEvenNumbers(nums);
        System.out.println(res);
    }

    private static int findEvenNumbers(int[] nums) {
        int count = 0;
        for (int element : nums) {
            if (isEvenDigits(element)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigits(int element) {
        return countDigits(element) % 2 == 0;
    }

    static int countDigits(int element) {
        int count = 0;
        while (element > 0) {
            count++;
            element = element / 10;
        }
        return count;
    }
}
