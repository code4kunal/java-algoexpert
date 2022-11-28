package com.dsa.practice;

import java.util.HashMap;
import java.util.Map;

public class firstDuplicate {
    public static int firstDuplicateValue(int[] array) {
        Map<String, Integer> mapOfCounts = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if (mapOfCounts.containsKey(String.valueOf(array[i]))){
              return array[i];
            } else {
                mapOfCounts.put(String.valueOf(array[i]), 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] input = new int[]{2, 1, 5, 2, 3, 3, 4};
       System.out.println(firstDuplicateValue(input));
    }
}
