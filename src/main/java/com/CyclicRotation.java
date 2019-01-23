package com;

public class CyclicRotation {

    public int[] solution(int[] inputArray, int input) {
        for (int i = 0; i < input; i++) {
            inputArray = moveIndexValueToRight(inputArray);
        }
        return inputArray;
    }

    private int[] moveIndexValueToRight(int[] inputArray) {
        int lastValue = inputArray[inputArray.length-1];
        int[] newArray = new int[inputArray.length];
        newArray[0] = lastValue;

        System.arraycopy(inputArray, 0, newArray, 1, inputArray.length - 1);

        return newArray;
    }
}
