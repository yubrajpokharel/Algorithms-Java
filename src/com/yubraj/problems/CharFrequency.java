package com.yubraj.problems;

import java.util.*;

/**
 * Created by yubraj on 12/18/16.
 */
public class CharFrequency {

    public static void main(String[] args) {
        String s1 = "aaaassfffffffasdfasdfasdfasdfawertwertnewirtuiewrtuoiwbshkjfhbus";
        System.out.println("Result :"+ process(s1));
    }

    public static String process(String s){

        final Map<Character, Integer> list = new HashMap<>();
        char[] chars = s.toCharArray();

        for(char c: chars){
            if(list.containsKey(c)){
                list.put(c, 1+list.get(c));
            }else{
                list.put(c, 1);
            }
        }

        List<Character> charList = new ArrayList<>(list.keySet());
        Collections.sort(charList, new Comparator<Character>() {
            @Override
            public int compare(Character t1, Character t2) {
                return list.get(t2) - list.get(t1);
            }
        });

        return charList.toString();

    }
}
