package com;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxCounters {
    public int[] solution(int counter, int[] input) {
        int[] answer = new int[counter];

        for (int val : input) {
            if (val > counter) {
                int max = Arrays.stream(answer).max().getAsInt();
                IntStream.range(0, counter).forEach(index -> {
                    answer[index] = max;
                });
            } else {
                answer[val-1]++;
            }
        }

        return answer;
    }

    public int[] solution2(int counter, int[] input) {
        int[] answer = new int[counter];

        for (int inputValue : input) {
            IntStream.range(0, counter).forEach(index -> {
                if(inputValue > counter) {
                    answer[index] = Arrays.stream(answer).max().getAsInt();
                } else {
                    if(0 <= inputValue && inputValue <= answer.length+1) {
                        if(index+1 == inputValue) {
                            answer[index]++;
                        }
                    }
                }
            });
        }

        return answer;
    }

    public int[] solution1(int counter, int[] input) {
        int[] answer = new int[counter];

        for (int inputValue : input) {
            setAnswer(inputValue > counter, inputValue, answer);
        }

        return answer;
    }

    private void setAnswer(boolean isCounterExceeds, int inputValue, int[] answer) {
        int max;
        for (int i = 0; i < answer.length; i++) {
            if(0 <= inputValue && inputValue <= answer.length+1) {
                if(i+1 == inputValue) {
                    answer[i]++;
                }
            }
        }
        if(isCounterExceeds) {
            max = Arrays.stream(answer).max().getAsInt();
            for (int i = 0; i < answer.length; i++) {
                answer[i] = max;
            }
        }
    }
}
