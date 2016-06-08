package com.yubraj.inplace;

import java.util.Arrays;

/**
 * Created by yubraj_pokharel on 6/8/16.
 *
 *
 * Best Case : O(n)  - only one comparison take place at the time
 * Average Case :O(n^2)
 * Worst Case : O(n^2)
 * Space Complexity : Inplace : O(1) it does not uses any other extra elements
 * Preferred for dealing with the small lists
 *
 * --------------------------------------------------------
 * PseudoCode
 * --------------------------------------------------------
 * for i <- 1 to n-1 {
 *      value <- arr[i]
 *      hole <- i
 *
 *      while (hole > 0 and value < a[hole -1]) {
 *          arr[hole] <- arr[hole-1]
 *          hole <- hole - 1
 *      }
 *      arr[hole] = value
 * }
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = insertionSort(arr1);

        System.out.println(Arrays.toString(arr2));
    }

    private static int[] insertionSort(int[] arr1) {
        for(int i = 1; i< arr1.length; i++){
            int j = i;
            int temp = arr1[i];
            while (j>0 && temp < arr1[j-1]){
                arr1[j] = arr1[j-1];
                j--;
            }
            arr1[j] = temp;
        }

        return arr1;
    }
}
