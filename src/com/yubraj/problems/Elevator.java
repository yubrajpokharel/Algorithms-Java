package com.yubraj.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubraj on 12/13/16.
 * Elevetor problem
 */
public class Elevator {
    public static void main(String[] args) {

        int A1[] = {40, 40, 100,80,20};
        int B1[] = {3,3,2,2,3};
        int M1=3,X1=5,Y1=200;
        //displayed in console
        Solution(A1, B1, M1, X1, Y1);


}

    public static void Solution(int[] A, int[] B, int M, int X, int Y){

        List<Integer> floors_need_to_stopped = new ArrayList<>();
        for(int i = 0 ; i< A.length; i++){
            if(!floors_need_to_stopped.contains(B[i]))
                floors_need_to_stopped.add(B[i]);
        }




        System.out.printf(floors_need_to_stopped.toString());

    }
}
