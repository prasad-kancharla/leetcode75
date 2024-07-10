package com.prasad.arraystring;

// https://leetcode.com/problems/merge-strings-alternately/description/
class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        boolean pickedFromWord1 = false;
        while (i < length1 && j < length2) {
            if (!pickedFromWord1) {
                sb.append(word1.charAt(i));
                i++;
            } else {
                sb.append(word2.charAt(j));
                j++;
            }
            pickedFromWord1 = !pickedFromWord1;
        }

        if (i < length1) {
            sb.append(word1.substring(i));
        }
        if (j < length2) {
            sb.append(word2.substring(j));
        }

        return sb.toString();
    }

}