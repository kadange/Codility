package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    private int[] array;
    private TapeEquilibrium tapeEquilibrium;

    @Before
    public void setUp() throws Exception {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void should_return_1_given_array_3_1_2_4_3() {
        array = new int[]{3,1,2,4,3};
        assertThat(tapeEquilibrium.solution(array), is(1));
    }

}