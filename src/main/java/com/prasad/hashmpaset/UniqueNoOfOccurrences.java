package com.prasad.hashmpaset;

import java.util.HashMap;
import java.util.Map;

class UniqueNoOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return countMap.values().stream().distinct().count() == countMap.entrySet().size();
    }
}