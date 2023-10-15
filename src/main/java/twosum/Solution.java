package twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        /* O(n^2)
        int first = -1;
        int second = -1;

        outerloop:
        for (int i = 0; i < nums.length; i++) {
            first = nums[i];
            for (int j = i + 1; j < nums.length; j++ ) {
                second = nums[j];
                int sum = first + second;
                if (sum == target) {
                    first = i;
                    second = j;
                    break outerloop;

                }
            }
        }

        int[] result = new int[2];

        if (first != -1) {
            result[0] = first;
        }
        if (second != -1) {
            result[1] = second;
        }

        return result;*/

        int first = -1;
        int second = -1;

        Map<Integer, Integer> map = new HashMap<>();

        outerloop:
        for (int i = 0; i < nums.length; i++) {
            first = nums[i];
            if (map.containsKey(target - first)) {
                second = map.get(target - first);
                first = i;
                break outerloop;
            }
            map.put(first, i);
        }

        int[] result = new int[2];

        if (first != -1) {
            result[0] = first;
        }
        if (second != -1) {
            result[1] = second;
        }

        return result;


    }

    String[] strArr = "aa".split("");

}
