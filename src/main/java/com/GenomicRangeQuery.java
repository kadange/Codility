package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        char[] word = S.toCharArray();
        List<Integer> answer = new ArrayList<>();
        IntStream.range(0, P.length).forEach(index -> {
            int start = P[index];
            int end = Q[index]+1;
            List<Integer> between = new ArrayList<>();
            IntStream.range(start, end).forEach(position -> {
                if(word[position] == 'A') {
                    between.add(1);
                }else if(word[position] == 'C') {
                    between.add(2);
                }else if(word[position] == 'G') {
                    between.add(3);
                }else if(word[position] == 'T') {
                    between.add(4);
                }
            });
            answer.add(Collections.min(between));
        });

        return answer.stream().mapToInt(i->i).toArray();
    }
}
