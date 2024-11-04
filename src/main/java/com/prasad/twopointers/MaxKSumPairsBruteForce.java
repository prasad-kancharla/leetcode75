package com.prasad.twopointers;

class MaxKSumPairsBruteForce {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int[] used = new int[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && used[i] == 0 && used[j] == 0 && nums[i] + nums[j] == k) {
                    used[i] = 1;
                    used[j] = 1;
                    count++;
                }
            }
        }
        return count;
    }
}