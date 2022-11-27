package com.dsa.practice;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {
    public static int longestPeak(int[] array) {
        List<Integer> currentPeak = new ArrayList<>();
        int maxLength = 0;
        int lastDigit = 0;
        Boolean reversal = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == array[i]) {
                currentPeak.clear();
            } else if (array[i + 1] > array[i]) {
                if(reversal){
                    currentPeak.clear();
                    reversal = false;
                }
                if (i == 0 || currentPeak.size() == 0) {
                    currentPeak.add(array[i]);
                    currentPeak.add(array[i + 1]);
                } else {
                    currentPeak.add(array[i + 1]);
                }
            } else {
                if (currentPeak.size() >= 2) {
                    currentPeak.add(array[i + 1]);
                    reversal = true;
                    if (currentPeak.size() > maxLength) {
                        maxLength = currentPeak.size();
                        lastDigit = array[i + 1];
                        if (i+2 <= array.length -1 && array[i+2] > lastDigit){
                            currentPeak.clear();
                        }
                    }
                }
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98, 0, -1, -1, 2, 3, 4, 5, 0, -1, -1};
        System.out.println(longestPeak(input));
    }
}
