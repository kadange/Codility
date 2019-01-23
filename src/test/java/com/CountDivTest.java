package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CountDivTest {

    private int A = 0;
    private int B = 0;
    private int K = 0;
    private CountDiv countDiv;

    @Before
    public void setUp() throws Exception {
        countDiv = new CountDiv();
    }

    @Test
    public void should_return_1_given_A_1_and_B_is_3_and_K_is_2() {
        A = 1; B = 3; K = 2;
        assertThat(countDiv.solution(A,B,K), is(1));
    }

    @Test
    public void should_return_2_given_A_2_and_B_is_4_and_K_is_2() {
        A = 2; B = 4; K = 2;
        assertThat(countDiv.solution(A,B,K), is(2));
    }

    @Test
    public void should_return_3_given_A_6_and_B_is_11_and_K_is_2() {
        A = 6; B = 11; K = 2;
        assertThat(countDiv.solution(A,B,K), is(3));
    }
}