package com.dsa.practice;

import java.util.*;

public class validSubSequence {
    public static boolean isValidSubsequence(List<Integer> input, List<Integer> sequence) {
        int index = 0;
        int prevIndex = -1;
        int count = 0;
        int i = 0;

        for(i=0; i< sequence.size(); i++ ){
            for (int j=index+1; j< input.size(); j++){
                if(input.get(j) == sequence.get(i)){
                    prevIndex = index;
                    index = j;
                    if (prevIndex < index){
                        count++;
                        break;
                    }
                }
            }
            if (count == sequence.size()){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 6, -1, 10));
        System.out.println(isValidSubsequence(input, sequence));
    }
}
