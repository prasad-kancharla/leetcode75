package com.prasad.arraystring;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/description
class GCDofStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) { // core logic
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    // based on euclidean algorithm
    private int gcd(int i, int j) {
        if (j == 0) {
            return i;
        }
        return gcd(j, i % j);
    }

}