package com.dsa.practice;

public class secondSmallest {
    public static void main(String[] args) {
        int[] arrayOfNos = new int[]{5, 7, 12, 1, 3, 23, 0, 1000, 8};
        float smallest = 0;
        float secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i< arrayOfNos.length; i++){
            if (i==0){
                smallest = arrayOfNos[i];
            } else {
                if (arrayOfNos[i] <= smallest) {
                    secondSmallest = smallest;
                    smallest = arrayOfNos[i];
                } else if (arrayOfNos[i] > smallest && arrayOfNos[i] < secondSmallest){
                    secondSmallest = arrayOfNos[i];
                }
            }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
}
