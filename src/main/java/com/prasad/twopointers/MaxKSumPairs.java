package com.prasad.twopointers;

import java.util.Arrays;

// https://leetcode.com/problems/max-number-of-k-sum-pairs/description/
class MaxKSumPairs {

    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        Arrays.sort(nums);
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum < k) {
                i++;
            } else if (sum > k) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}