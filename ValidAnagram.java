//https://leetcode.com/problems/valid-anagram/description/

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        if(s1.length() != s2.length()){
            System.out.println("false");
        }

        char[] one = s1.toCharArray();
        char[] two = s2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if(Arrays.equals(one, two)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
