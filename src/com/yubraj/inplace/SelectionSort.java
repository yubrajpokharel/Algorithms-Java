package com.yubraj.inplace;

/**
 * Created by yubraj_pokharel on 6/7/16.
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = selectionSort(arr1);

        System.out.println(Arrays.toString(arr2));

        System.out.println(String.format("\nTotal Time : " + System.currentTimeMillis()));
    }

    private static int[] selectionSort(int[] arr1) {
        for (int i = 0; i<arr1.length; i++){
            int index = i;

            for (int j = i+1; j<arr1.length; j++){
                if(arr1[index] < arr1[j]) index = j;
            }

            int tempNum = arr1[index];
            arr1[index] = arr1[i];
            arr1[i] = tempNum;

        }

        return arr1;
    }


}
