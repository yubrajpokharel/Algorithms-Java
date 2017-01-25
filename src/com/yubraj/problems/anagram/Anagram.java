package com.yubraj.problems.anagram;

import java.util.Arrays;

/**
 * Created by yubraj on 1/24/17.
 */
public class Anagram {
    public static void main(String[] args) {
        String s1 ="shyam", s2="hsopynis";
        System.out.println(isAnagram(s1, s2));
    }


    public static int isAnagram(String s, String t){
        boolean isAnagram = true;

        if(s.length() != t.length())
            isAnagram = false;

        int[] letters = new int[128];

        for (int i = 0; i < s.length(); i++)
            letters[s.charAt(i)]++;

        for (int i = 0; i < t.length(); i++) {
            if(letters[t.charAt(i)]-- < 0)
                isAnagram = false;
        }

        if(!isAnagram){
            int sum = 0;
            int[] counter = new int[128];
            char[] charArray = s.toCharArray();

            for (int i = 0; i < s.length(); i++)
                counter[charArray[i]]++;

            charArray = t.toCharArray();
            for (int i = 0; i < t.length(); i++)
                counter[charArray[i]]--;

            for (int i = 0; i < counter.length; i++)
                sum += counter[i];

            return Math.abs(sum);
        }

        return 0;
    }

}
