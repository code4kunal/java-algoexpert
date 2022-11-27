package com.dsa.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortedSquaredArray {
    public static int[] sortedSquaredArray(int[] array) {
        List<Integer> sortedList = Arrays.stream(array)
                .map(ar-> ar*ar).boxed()
                .sorted()
                .collect(Collectors.toList());

        return sortedList.stream().mapToInt(in-> in).toArray();
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 5, 6, 8, 9};
        Arrays.stream(sortedSquaredArray(input)).forEach(System.out::println);
    }

}
