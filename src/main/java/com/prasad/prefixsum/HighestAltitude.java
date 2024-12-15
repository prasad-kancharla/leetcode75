package com.prasad.prefixsum;

// https://leetcode.com/problems/find-the-highest-altitude
class HighestAltitude {
    public static void main(String[] args) {
        int[] input = {-5, 1, 5, 0, -7};
        System.out.println(new HighestAltitude().largestAltitude(input));
    }

    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currAltitude += gain[i];
            maxAltitude = Math.max(currAltitude, maxAltitude);
        }
        return maxAltitude;
    }
}