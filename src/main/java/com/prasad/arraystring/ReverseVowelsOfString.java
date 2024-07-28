package com.prasad.arraystring;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/reverse-vowels-of-a-string/description/
class ReverseVowelsOfString {

    public static void main(String[] args) {
        System.out.println(new ReverseVowelsOfString().reverseVowels("hello"));
    }

    public String reverseVowels(String s) {
        int n = s.length();
        List<Integer> vowelIndexes = new ArrayList();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelIndexes.add(i);
            }
        }
        char[] chars = s.toCharArray();
        if (!vowelIndexes.isEmpty()) {
            int i = 0;
            int j = vowelIndexes.size() - 1;
            while (i < j) {
                int index1 = vowelIndexes.get(i);
                int index2 = vowelIndexes.get(j);
                char temp = s.charAt(index1);
                chars[index1] = chars[index2];
                chars[index2] = temp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

}