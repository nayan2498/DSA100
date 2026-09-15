//https://leetcode.com/problems/top-k-frequent-elements/description/

//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(freq.keySet());

        list.sort((a, b) -> freq.get(b) - freq.get(a));

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9 };
        int k = 2;
        int[] res = topKFrequent(nums, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
