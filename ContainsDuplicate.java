//https://leetcode.com/problems/contains-duplicate/description/

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


import java.util.HashMap;
import java.util.Map;


public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums){
        int n = nums.length;
        HashMap<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < n; i++) {
            res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,5,5,6,7,8,8};
        boolean res = containsDuplicate(nums);
        System.out.println(res);
    }
    
}
