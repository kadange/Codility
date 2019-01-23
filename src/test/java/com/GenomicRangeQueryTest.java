package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GenomicRangeQueryTest {

    private String S;
    private int[] P;
    private int[] Q;
    private GenomicRangeQuery genomicRangeQuery;

    @Before
    public void setUp() throws Exception {
        genomicRangeQuery = new GenomicRangeQuery();
    }

    @Test
    public void should_return_array_1_4_given_string_ACGT_and_array_P_0_3_and_array_Q_1_2() {
        S = "ACGT";
        P = new int[]{0,3};
        Q = new int[]{1,3};
        assertThat(genomicRangeQuery.solution(S,P,Q), is(new int[]{1,4}));
    }

    @Test
    public void should_return_array_1_2_given_string_ACGT_and_array_P_0_1_and_array_Q_2_3() {
        S = "ACGT";
        P = new int[]{0,1};
        Q = new int[]{2,3};
        assertThat(genomicRangeQuery.solution(S,P,Q), is(new int[]{1,2}));
    }

    @Test
    public void should_return_array_2_4_1_given_string_CAGCCTA_and_array_P_2_5_0_and_array_Q_4_5_6() {
        S = "CAGCCTA";
        P = new int[]{2,5,0};
        Q = new int[]{4,5,6};
        assertThat(genomicRangeQuery.solution(S,P,Q), is(new int[]{2,4,1}));
    }
}