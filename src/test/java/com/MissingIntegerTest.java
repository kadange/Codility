package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MissingIntegerTest {

    private int[] array;
    private MissingInteger missingInteger;

    @Before
    public void setUp() throws Exception {
        missingInteger = new MissingInteger();
    }

    @Test
    public void should_return_4_given_array_1_2_3() {
        array = new int[]{1,2,3};
        assertThat(missingInteger.solution(array), is(4));
    }

    @Test
    public void should_return_1_given_negative_1_and_negative_3() {
        array = new int[]{-1,-2,-3};
        assertThat(missingInteger.solution(array), is(1));
    }

    @Test
    public void should_return_5_given_array_1_3_6_4_1_2() {
        array = new int[]{1,3,6,4,1,2};
        assertThat(missingInteger.solution(array), is(5));
    }

    @Test
    public void should_return_5_given_array_10_2_5_6_7_1_3_4_7_9_8_10_9_10_10() {
        array = new int[]{10,2,5,6,7,1,3,4,7,9,8,10,9,10,10};
        assertThat(missingInteger.solution(array), is(11));
    }

    @Test
    public void should_return_1_given_array_2_3_4_5() {
        array = new int[]{2,3,4,5};
        assertThat(missingInteger.solution(array), is(1));
    }
}