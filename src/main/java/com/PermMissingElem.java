package com;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] input) {
        long length = input.length + 1;
        long sum = length * (length + 1) / 2;
        for (int i = 0; i < input.length; i++) {
            sum -= input[i];
        }
        return (int) sum;
    }
}
