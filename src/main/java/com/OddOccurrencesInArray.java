package com;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        int value = 0;
        for(int number : A) {
            value ^= number;
        }
        return value;
    }
}
