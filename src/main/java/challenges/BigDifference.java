package challenges;

import java.util.Arrays;

// Variation of "Array of Products"

/**
 * Given an array of integers, write a function to return an array where each
 * element is the difference between the sum of values to the left and sum of
 * values to the right.
 * 
 * Example 1. Input: [4,2,7]. Output: [9,3,6].
 * 
 * Example 2. Input: [2,4,1,5,6]. Output: [16,10,5,1,12].
 */
public class BigDifference {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bd1(new int[] { 4, 2, 7 })));
        System.out.println(Arrays.toString(bd1(new int[] { 2, 4, 1, 5, 6 })));
        System.out.println(Arrays.toString(bd2(new int[] { 4, 2, 7 })));
        System.out.println(Arrays.toString(bd2(new int[] { 2, 4, 1, 5, 6 })));
    }

    // Brute force. Time complexity: O(n^2). Space complexity: O(n).
    static int[] bd1(int[] values) {
        int[] diffs = new int[values.length];
        for (int i = 0; i < values.length; ++i) {
            int leftSum = 0;
            int rightSum = 0;
            for (int left = 0; left < i; ++left) {
                leftSum += values[left];
            }
            for (int right = i + 1; right < values.length; ++right) {
                rightSum += values[right];
            }
            diffs[i] = Math.abs(leftSum - rightSum);
        }
        return diffs;
    }

    // Time: O(n). Space: O(n).
    static int[] bd2(int[] values) {
        int[] diffs = new int[values.length];
        for (int i = 1; i < values.length; ++i) {
            diffs[i] += values[i - 1] + diffs[i - 1];
        }
        int rightAcc = 0;
        for (int i = values.length - 1; i >= 0; --i) {
            diffs[i] = Math.abs(diffs[i] - rightAcc);
            rightAcc += values[i];
        }
        return diffs;
    }
}
