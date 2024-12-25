package com.prasad.hashmpaset;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class TwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }


        if (!map2.keySet().equals(map1.keySet())) return false;

        List<Integer> vals1 = map1.values().stream().sorted().collect(Collectors.toList());
        List<Integer> vals2 = map2.values().stream().sorted().collect(Collectors.toList());
        if (!vals1.equals(vals2)) return false;

        return true;
    }
}