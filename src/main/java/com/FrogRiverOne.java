package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FrogRiverOne {

    public int solution(int x, int[] input) {
        HashSet list = new HashSet();

        for(int i=0; i < input.length; i++) {
            list.add(input[i]);

            if(list.size() == x) {
                return i;
            }
        }

        return -1;
    }

    public int solution2(int x, int[] input) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < input.length; i++) {
            if(list.isEmpty() || !list.contains(input[i])) {
                list.add(input[i]);
            }

            if(list.size() == x) {
                return i;
            }
        }

        return -1;
    }

    public int solution1(int x, int[] input) {
        List<Integer> list = createList(x);

        if(x == 0) {
            return -1;
        }

        for (int i = 0; i < input.length; i++) {
            if(list.contains(input[i])) {
                list.remove(Integer.valueOf(input[i]));
            }
            if(list.isEmpty()) {
                return i;
            }
        }

        return -1;
    }

    private List<Integer> createList(int x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            list.add(i);
        }
        return list;
    }
}
