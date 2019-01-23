package com;

public class FrogJmp {

    public int solution(int from, int to, int distance) {
        return (int)Math.ceil((double)(to-from)/distance);
    }
}
