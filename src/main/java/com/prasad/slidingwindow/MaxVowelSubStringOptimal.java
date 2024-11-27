package com.prasad.slidingwindow;

// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description
class MaxVowelSubStringOptimal {
    public static void main(String[] args) {
        System.out.println(new MaxVowelSubStringOptimal().maxVowels("weallloveyou", 7));
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (isVowel(s.charAt(i))) count++;

            if (i >= k && isVowel(s.charAt(i - k))) count--;
            max = Math.max(count, max);
        }
        return max;
    }
}