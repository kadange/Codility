package com;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] input) {
        Arrays.sort(input);
        int number = 1;
        int prev = 1;

        for (int index : input) {
            if (index >= number) {
                number++;
                if(number > index) {
                    prev = number;
                }
            }
        }

        return prev;
    }
}
