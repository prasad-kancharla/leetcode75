package com.prasad.twopointers;

// https://leetcode.com/problems/move-zeroes/
class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int index = 0;
        int zeroesCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroesCount++;
            } else {
                nums[index++] = num;
            }
        }

        for (int i = 0; i < zeroesCount; i++) {
            nums[index++] = 0;
        }
    }

}