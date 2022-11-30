package com.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeIntervals {
    public static int[][] mergeOverlappingIntervals(int[][] intervals) {

        List<int[]> finalResult = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));

        int currentIndex = 0;
        finalResult.add(intervals[0]);

        for(int i=1; i<intervals.length; i++){
            if(finalResult.get(currentIndex)[1] >= intervals[i][0]){
                finalResult.set(currentIndex, new int[]{finalResult.get(currentIndex)[0],
                        Math.max(finalResult.get(currentIndex)[1],intervals[i][1])});
            }else{
                currentIndex++;
                finalResult.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        return finalResult.toArray(new int[finalResult.size()][]);
    }

    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        mergeOverlappingIntervals(input);
    }
}
