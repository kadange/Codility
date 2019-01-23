package com;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PermCheckTest {

    private int[] array;
    private PermCheck permCheck;

    @Before
    public void setUp() throws Exception {
        permCheck = new PermCheck();
    }

    @Test
    public void should_return_1_given_array_1_2_3_4() {
        array = new int[]{1,2,3,4};
        assertThat(permCheck.solution(array), is(1));
    }

    @Test
    public void should_return_0_given_array_1_2_4() {
        array = new int[]{1,2,4};
        assertThat(permCheck.solution(array), is(0));
    }

    @Test
    public void should_return_1_given_array_1_to_100000() {
        array = createArray(100000);
        assertThat(permCheck.solution(array), is(1));
    }

    private int[] createArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = i+1;
        }
        return array;
    }
}