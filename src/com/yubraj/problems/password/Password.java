package com.yubraj.problems.password;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubraj on 1/24/17.
 */
public class Password {
    public static void main(String[] args) {
        String string = "";
        System.out.println(solution(string));
    }

    private static int solution(String string) {
        List<String> strings = new ArrayList<>();
        for(int i = 0 ; i < string.length() ; i++ ){
            for(int j = 1 ; j <= string.length() - i ; j++ ){
                String sub = string.substring(i, i+j);
                strings.add(sub);
            }
        }



        return -1;
    }



}
