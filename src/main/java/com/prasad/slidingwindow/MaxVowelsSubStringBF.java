package com.prasad.slidingwindow;

class MaxVowelsSubStringBF {
    public static void main(String[] args) {
        System.out.println(new MaxVowelsSubStringBF().maxVowels("weallloveyou", 7));
    }

    public int maxVowels(String s, int k) {
        int n = s.length();
        if (n == 1) {
            int ans = isVowel(s.charAt(0)) ? 1 : 0;
            return ans;
        }

        int ans = 0;
        for (int i = 0; i < n - k + 1; i++) {
            String sub = s.substring(i, i + k);
            int count = getVowels(sub);
            ans = Math.max(count, ans);
        }
        return ans;
    }

    int getVowels(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) count++;
        }
        return count;
    }

    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}