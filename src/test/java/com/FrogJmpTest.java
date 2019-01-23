package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FrogJmpTest {

    private int from = 0;
    private int to = 0;
    private int distance = 0;
    private FrogJmp frogJmp;

    @Before
    public void setUp() throws Exception {
        frogJmp = new FrogJmp();
    }

    @Test
    public void should_return_3_given_from_is_0_and_to_is_30_and_distance_is_10() {
        to = 30;
        distance = 10;
        assertThat(frogJmp.solution(from,to,distance), is(3));
    }

    @Test
    public void should_return_4_given_from_is_10_and_to_is_40_and_distance_is_10() {
        from = 10;
        to = 40;
        distance = 10;
        assertThat(frogJmp.solution(from,to,distance), is(3));
    }
}