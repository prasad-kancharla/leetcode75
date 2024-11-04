package com.prasad.slidingwindow;

// https://leetcode.com/problems/maximum-average-subarray-i/description
class MaximumAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return nums[0];
        double maxAverage = -Double.MAX_VALUE;
        int[] prefixSum = new int[n];

        for (int i = 0; i < n; i++) {
            prefixSum[i] = i == 0 ? nums[i] : prefixSum[i - 1] + nums[i];
        }

        for (int i = 0; i < n - k + 1; i++) {
            double sum = i == 0 ? prefixSum[i + k - 1] : prefixSum[i + k - 1] - prefixSum[i - 1];
            double average = sum / k;
            maxAverage = Math.max(average, maxAverage);
        }
        return maxAverage;
    }
}