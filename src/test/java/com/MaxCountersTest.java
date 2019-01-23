package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxCountersTest {

    private int[] array;
    private MaxCounters maxCounters;

    @Before
    public void setUp() throws Exception {
        maxCounters = new MaxCounters();
    }

    @Test
    public void should_return_array_1_given_array_1_and_counter_1() {
        array = new int[]{1};
        assertThat(maxCounters.solution(1,array), is(new int[]{1}));
    }

    @Test
    public void should_return_array_2_given_array_1_1_and_counter_1() {
        array = new int[]{1,1};
        assertThat(maxCounters.solution(1,array), is(new int[]{2}));
    }

    @Test
    public void should_return_array_3_given_array_1_1_1_and_counter_1() {
        array = new int[]{1,1};
        assertThat(maxCounters.solution(1,array), is(new int[]{2}));
    }

    @Test
    public void should_return_array_1_1_given_array_1_2_3_and_counter_2() {
        array = new int[]{1,2,3};
        assertThat(maxCounters.solution(2,array), is(new int[]{1,1}));
    }

    @Test
    public void should_return_array_3_2_2_given_array_2_2_3_4_1_and_counter_3() {
        array = new int[]{2,2,3,4,1};
        assertThat(maxCounters.solution(3,array), is(new int[]{3,2,2}));
    }

    @Test
    public void should_return_array_3_2_2_4_2_given_array_3_4_4_6_1_4_4_and_counter_5() {
        array = new int[]{3,4,4,6,1,4,4};
        assertThat(maxCounters.solution(5,array), is(new int[]{3,2,2,4,2}));
    }
    @Test
    public void should_return_array_3_given_array_1_and_counter_5() {
        array = new int[]{3,4,4,6,1,4,4};
        assertThat(maxCounters.solution(5,array), is(new int[]{3,2,2,4,2}));
    }
}