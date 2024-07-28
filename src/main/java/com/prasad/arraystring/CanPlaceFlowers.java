package com.prasad.arraystring;

// https://leetcode.com/problems/can-place-flowers/description/
class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] input = {0, 0, 0, 0, 0, 1, 0, 0};
        System.out.println(new CanPlaceFlowers().canPlaceFlowers(input, 0));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0) {
                return true;
            }
        }
        return false;
    }

}