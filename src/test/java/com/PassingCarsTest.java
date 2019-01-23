package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassingCarsTest {

    private int[] array;
    private PassingCars passingCars;

    @Before
    public void setUp() throws Exception {
        passingCars = new PassingCars();
    }

    @Test
    public void should_return_1_given_array_0_1() {
        array = new int[]{0,1};
        assertThat(passingCars.solution(array), is(1));
    }

    @Test
    public void should_return_3_given_array_0_1_0_1() {
        array = new int[]{0,1,0,1};
        assertThat(passingCars.solution(array), is(3));
    }

    @Test
    public void should_return_4_given_array_0_1_0_0_1() {
        array = new int[]{0,1,0,0,1};
        assertThat(passingCars.solution(array), is(4));
    }

    @Test
    public void should_return_5_given_array_0_1_0_1_1() {
        array = new int[]{0,1,0,1,1};
        assertThat(passingCars.solution(array), is(5));
    }
}