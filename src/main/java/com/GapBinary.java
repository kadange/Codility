package com;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class GapBinary {

    public int solution(int input) {
        int binaryCount = getBinaryCount(input);
        int binaryValue = getHighestBinaryValue(input);
        List<Integer> binary = getBinaryList(binaryCount, binaryValue, input);

        return getMax(binary);
    }

    private int getMax(List<Integer> binary) {
        int count = 0;
        List<Integer> max = new ArrayList<>();
        for (Integer integer : binary) {
            if(integer.equals(0)) {
                count++;
            }else{
                max.add(count);
                count = 0;
            }
        }
        return max.stream().mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
    }

    public List<Integer> getBinaryList(int binaryCount, int binaryValue, int input) {
        List<Integer> binary = new ArrayList<>();
        for(int i=0; i<binaryCount; i++) {
            if(input >= binaryValue) {
                binary.add(1);
                input -= binaryValue;
            }else{
                binary.add(0);
            }
            binaryValue/=2;
        }
        return binary;
    }

    public int getHighestBinaryValue(int input) {
        int currentBinary = 1;
        int previousBinary = 1;
        for(int i=0; i<input; i++) {
            currentBinary *= 2;
            if(currentBinary >= input) {
                break;
            }
            previousBinary = currentBinary;
        }

        return previousBinary;
    }

    public int getBinaryCount(int input) {
        int binaryValue = 1;
        int i=0;
        for(; i<input; i++) {
            if(binaryValue > input){
                break;
            }
            binaryValue *= 2;
        }

        return i;
    }
}
