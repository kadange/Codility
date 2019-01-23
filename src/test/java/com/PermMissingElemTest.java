package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PermMissingElemTest {
    private int[] input;
    private PermMissingElem permMissingElem;

    @Before
    public void setUp() throws Exception {
        permMissingElem = new PermMissingElem();
    }

    @Test
    public void should_return_4_given_array_1_2_3_5() {
        input = new int[]{5,3,1,2};
        assertThat(permMissingElem.solution(input), is(4));
    }

    @Test
    public void should_return_5_given_array_1_2_3_4_6_7_8_9_10() {
        input = new int[]{4,3,1,2,10,9,7,8,6};
        assertThat(permMissingElem.solution(input), is(5));
    }

    @Test
    public void should_return_2_given_array_1() {
        input = new int[]{1};
        assertThat(permMissingElem.solution(input), is(2));
    }

    @Test
    public void should_return_1_given_array_2() {
        input = new int[]{2};
        assertThat(permMissingElem.solution(input), is(1));
    }
}