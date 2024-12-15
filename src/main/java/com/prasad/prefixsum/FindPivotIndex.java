package com.prasad.prefixsum;

class FindPivotIndex {
    public static void main(String[] args) {
        int[] input = {2,1,-1};
        System.out.println(new FindPivotIndex().pivotIndex(input));
    }
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixLS = new int[n];
        int[] prefixRS = new int[n];

        for (int i = 1; i < n; i++) {
            prefixLS[i] = prefixLS[i - 1] + nums[i - 1];
        }

        for (int i = n - 2; i >= 0 ; i--) {
            prefixRS[i] = prefixRS[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            if (prefixLS[i] == prefixRS[i]) return i;
        }
        return -1;
    }
}