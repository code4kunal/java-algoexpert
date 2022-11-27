package com.dsa.practice;

import java.util.Arrays;
/*
* Sum of element of an array equal to target
* */
public class sumOfTwoNo {
    public static int[] twoNumberSum(int[] a, int targetSum) {
        int[] addsToTarget =  new int[2];
        for (int i= 0; i < a.length; i++){
            for (int j= 0; j < a.length; j++ ){
              if(a[i]+a[j] == targetSum){
                  addsToTarget[0] = a[i];
                  addsToTarget[1] = a[j];
                  break;
              }
            }
        }
        if (addsToTarget[0] == 0 && addsToTarget[1] == 0){
            int[] result = {};
            addsToTarget = result;
        }

        return addsToTarget;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        Arrays.stream(twoNumberSum(input, targetSum)).forEach(System.out::println);
    }
}
