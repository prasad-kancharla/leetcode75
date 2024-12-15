package com.prasad.slidingwindow;

// https://leetcode.com/problems/max-consecutive-ones-iii/description/
class LongestOnesBruteForce {
    public static void main(String[] args) {
        int[] input = {0};
        System.out.println(new LongestOnesBruteForce().longestOnes(input, 1));
    }

    // rewrite the problem - find a max length of sub array with at most k zeroes
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int n = nums.length;
        if (k >= n) return n;

        // find all sub arrays
        for (int i = 0; i < n; i++) {
            int zeroesInCurrentSubArray = nums[i] == 0 ? 1 : 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] == 0) {
                    if (zeroesInCurrentSubArray == k) {
                        // you cannot pick the current element as it is zero so length would be till previous element (j - 1 - i + 1)
                        maxLen = Math.max(j - i, maxLen);
                        break;
                    } else {
                        zeroesInCurrentSubArray++;
                    }
                }
                // update max len when current element is 1, only when zeroes count <= k
                if (zeroesInCurrentSubArray <= k) maxLen = Math.max(j - i + 1, maxLen);
            }
        }

        return maxLen;
    }

    // better code
    public int longestOnes2(int[] nums, int k) {
        int maxLen = 0;
        int n = nums.length;
        if (k >= n) return n;

        // find all sub arrays
        for (int i = 0; i < n; i++) {
            int zeroesInCurrentSubArray = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) zeroesInCurrentSubArray++;
                if (zeroesInCurrentSubArray <= k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                } else {
                    break;
                }
            }
        }

        return maxLen;
    }
}