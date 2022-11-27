package com.dsa.practice;

import java.util.*;
import java.util.stream.Collectors;

public class winnerOfTournament {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        List<String> winners = new ArrayList<>();
        for (int i=0; i<competitions.size(); i++){
            winners.add(results.get(i) == 0 ? competitions.get(i).get(1) : competitions.get(i).get(0));
        }

       return winners.stream()
                .collect(Collectors.groupingBy(win-> win, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getKey();

    }
}
