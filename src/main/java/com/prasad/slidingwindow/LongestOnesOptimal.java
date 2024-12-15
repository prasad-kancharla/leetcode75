package com.prasad.slidingwindow;

// https://leetcode.com/problems/max-consecutive-ones-iii/description/
// https://www.youtube.com/watch?v=3E4JBHSLpYk
public class LongestOnesOptimal {
    public static void main(String[] args) {
        int[] input = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(new LongestOnesOptimal().longestOnes(input, 2));
    }

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;

        int zeroes = 0;
        int maxLength = 0;

        while (right < n) {
            if (nums[right] == 0) zeroes++;
            while (zeroes > k) {
                if (nums[left] == 0) zeroes--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
