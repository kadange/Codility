package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CyclicRotationTest {

    private int[] inputArray;
    private int rotation = 0;
    private int[] answer;
    private CyclicRotation cyclicRotation;

    @Before
    public void setUp() throws Exception {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    public void should_return_4_1_2_3_given_rotation_1_and_array_1_2_3_4() {
        inputArray = new int[]{1,2,3,4};
        rotation = 1;
        answer = cyclicRotation.solution(inputArray, rotation);
        assertThat(answer, is(new int[]{4,1,2,3}));
    }

    @Test
    public void should_return_3_4_1_2_given_rotation_2_and_array_1_2_3_4() {
        inputArray = new int[]{1,2,3,4};
        rotation = 2;
        answer = cyclicRotation.solution(inputArray, rotation);
        assertThat(answer, is(new int[]{3,4,1,2}));
    }

    @Test
    public void should_return_2_3_4_1_given_rotation_3_and_array_1_2_3_4() {
        inputArray = new int[]{1,2,3,4};
        rotation = 3;
        answer = cyclicRotation.solution(inputArray, rotation);
        assertThat(answer, is(new int[]{2,3,4,1}));
    }
}