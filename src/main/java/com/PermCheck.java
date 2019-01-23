package com;

public class PermCheck {

    public int solution(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if(i+1 != input[i]){
                return 0;
            }
        }
        return 1;
    }
}
