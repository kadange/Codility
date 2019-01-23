package com;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {

    @Test
    public void should_return_7_given_3_9_3_7_9() {
        int[] input = {3,9,3,7,9};
        OddOccurrencesInArray array = new OddOccurrencesInArray();
        assertThat(array.solution(input), is(7));
    }
}