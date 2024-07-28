package com.prasad.arraystring;

// https://leetcode.com/problems/reverse-words-in-a-string/description/
class ReverseWordsInAString {

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        StringBuilder temp = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            } else if (temp.length() > 0) {
                sb.append(temp.reverse());
                sb.append(" ");
                temp.setLength(0);
            }
        }
        sb.append(temp.reverse());
        return sb.toString();
    }

}