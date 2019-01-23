package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FrogRiverOneTest {

    private int[] array;
    private FrogRiverOne frogRiverOne;

    @Before
    public void setUp() throws Exception {
        frogRiverOne = new FrogRiverOne();
    }

    @Test
    public void should_return_4_given_array_1_2_3_4_5_and_x_is_5() {
        array = new int[]{1,2,3,4,5};
        assertThat(frogRiverOne.solution(5, array), is(4));
    }

    @Test
    public void should_return_4_given_array_1_2_4_5_3_and_x_is_5() {
        array = new int[]{1,2,3,4,5};
        assertThat(frogRiverOne.solution(5, array), is(4));
    }

    @Test
    public void should_return_6_given_array_1_1_1_5_3_4_2_3_and_x_is_5() {
        array = new int[]{1,1,1,5,3,4,2,3};
        assertThat(frogRiverOne.solution(5, array), is(6));
    }

    @Test
    public void should_return_negative_1_given_array_1_and_x_is_2() {
        array = new int[]{1};
        assertThat(frogRiverOne.solution(2, array), is(-1));
    }

    @Test
    public void should_return_negative_1_given_array_1_2_3_4_5_and_x_is_0() {
        array = new int[]{1,2,3,4,5};
        assertThat(frogRiverOne.solution(0, array), is(-1));
    }

    @Test
    public void should_return_9999_given_array_1_to_10000_and_x_is_10000() {
        array = createArray(10000);
        assertThat(frogRiverOne.solution(10000, array), is(9999));
    }

    private int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i+1;
        }
        return array;
    }
}