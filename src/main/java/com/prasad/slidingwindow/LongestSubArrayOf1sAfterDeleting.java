package com.prasad.slidingwindow;

// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
public class LongestSubArrayOf1sAfterDeleting {
    public int longestSubarray(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroes = 0;

        while (right < n) {
            if (nums[right] == 0) {
                zeroes++;
            }
            while (zeroes > 1) {
                if (nums[left] == 0) zeroes--;
                left++;
            }
            if (zeroes <= 1) {
                maxLength = Math.max(maxLength, right - left);
            }
            right++;
        }
        return maxLength;
    }
}