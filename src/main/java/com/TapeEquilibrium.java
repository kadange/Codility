package com;

public class TapeEquilibrium {

    public int solution(int[] inputArray) {
        int total = 0;

        for (int indexValue : inputArray) {
            total += indexValue;
        }

        int minValue = Integer.MAX_VALUE;
        int prev = 0;
        int next = 0;

        for (int p = 1; p < inputArray.length; p++) {
            prev += inputArray[p - 1];
            next = total - prev;
            minValue = Math.min(minValue, Math.abs(prev - next));
        }

        return minValue;
    }
}
