package com;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class PassingCars {

    public int solution(int[] input) {
        AtomicInteger pairCount = new AtomicInteger();
        IntStream.range(0,input.length)
                .forEach(index -> {
            if(input[index] == 1) {
                return;
            }
            IntStream.range(index + 1, input.length)
                    .filter(i -> input[i] == 1)
                    .forEach(i -> pairCount.set(pairCount.addAndGet(1)));
        });
        return pairCount.get() > 1000000000 ? -1 : pairCount.get();
    }

    public int solution1(int[] input) {
        int pairCount = 0;
        for (int index = 0; index < input.length; index++) {
            if (input[index] == 1) {
                continue;
            }
            for (int i = index + 1; i < input.length; i++) {
                if (input[i] == 0) {
                    continue;
                }
                pairCount++;
            }
        }
        return pairCount > 1000000000 ? -1 : pairCount;
    }
}
