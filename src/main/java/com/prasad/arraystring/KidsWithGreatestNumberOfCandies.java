package com.prasad.arraystring;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList();
        int maxCandies = -1;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

}
