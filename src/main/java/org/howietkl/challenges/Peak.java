package org.howietkl.challenges;

public class Peak {

    public static void main(String [] args) {
        System.out.println(peak(new int[]{ 1 }) + " " + peak2(new int[]{ 1 }));
        System.out.println(peak(new int[]{ 0, 1 }) + " " + peak2(new int[]{ 0, 1 }));
        System.out.println(peak(new int[]{ 1,2,3,1 }) + " " + peak2(new int[]{ 1,2,3,1 }));
        System.out.println(peak(new int[]{ 1,2,1,3,5,6,4 }) + " " + peak2(new int[]{ 1,2,1,3,5,6,4 }));
        System.out.println(peak(new int[]{ 1,2,3 }) + " " + peak2(new int[]{ 1,2,3 }));
        System.out.println(peak(new int[]{ 3,2,1 }) + " " + peak2(new int[]{ 3,2,1 }));
        System.out.println(peak(new int[]{ 1,2,1 }) + " " + peak2(new int[]{ 1,2,1 }));

    }

    // O(n)
    public static int peak(int[] nums) {
        int peak = 0;
        for (int i = 0; i < nums.length; ++i) {
            int previous = (i == 0) ? Integer.MIN_VALUE : nums[i - 1];
            int next = (i == nums.length - 1) ? Integer.MIN_VALUE : nums[ i + 1];
            if (nums[i] > previous && nums[i] > next) {
                peak = i;
                break;
            }
        }
        return peak;
    }

    // O(log(n))
    public static int peak2(int[] nums) {
        int start = 0;
        int end = nums.length;
        int mid =  (start + end) / 2;

        while (start < end) {
            int previous = (mid == 0) ? Integer.MIN_VALUE : nums[mid - 1];
            int next = (mid == nums.length - 1) ? Integer.MIN_VALUE : nums[mid+ 1];
            int current = nums[mid];

            if (current > previous) {
                if (current > next) {
                    return mid;
                } else { // search uphill right
                    start = mid + 1;
                    mid = (start + end) / 2;
                }
            } else if (current > next) { // search uphill left
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return mid;
    }

}
