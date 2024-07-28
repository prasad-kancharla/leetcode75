package com.prasad.arraystring;

// https://leetcode.com/problems/product-of-array-except-self/description/
class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] product = new int[n];

        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        rightProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            product[i] = leftProduct[i] * rightProduct[i];
        }
        return product;
    }

}