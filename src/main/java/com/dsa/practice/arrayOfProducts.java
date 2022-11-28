package com.dsa.practice;

import java.util.*;

public class arrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {
        String s = "myString";
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while ( i < array.length){
            int product  = 1;
            for (int j=0; j <array.length; j++){
                if (j==i){
                    continue;
                } else {
                    product = product * array[j];
                }
            }
            result.add(product);
            product = 1;
            i++;
        }
        return result.stream().mapToInt(in-> in).toArray();
    }

    public static void main(String[] args) {
        int[] input = new int[]{5, 1, 4, 2};
        Arrays.stream(arrayOfProducts(input)).forEach(System.out::println);
    }

}
