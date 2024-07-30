package com.prasad.arraystring;

// https://leetcode.com/problems/string-compression/description/
class StringCompression {

    public int compress(char[] chars) {
        int n = chars.length;
        int count = 1;
        char prevChar = chars[0];

        int index = 0;
        for (int i = 1; i < n; i++) {
            if (chars[i] != prevChar) {
                chars[index++] = prevChar;
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                prevChar = chars[i];
                count = 1;
            } else {
                count++;
            }
        }
        chars[index++] = prevChar;
        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                chars[index++] = c;
            }
        }
        return index;
    }

}