package com;

public class CountDiv {
    public int solution(int a, int b, int k) {
        return (b/k) - (a/k) + (a%k == 0 ? 1 : 0);
    }

    public int solution1(int a, int b, int k) {
        int count = 0;
        while (a<=b) {
            if(a%k==0) count++;
            a++;
        }
        return count;
    }
}
