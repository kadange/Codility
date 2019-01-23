package com;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GapBinaryTest {

    GapBinary gapBinary = new GapBinary();

    @Test
    public void test1() {
        int value = gapBinary.solution(1041);
        assertThat(5, is(value));
    }

    @Test
    public void test2() {
        int value = gapBinary.solution(15);
        assertThat(0, is(value));
    }

    @Test
    public void test3() {
        int value = gapBinary.solution(32);
        assertThat(0, is(value));
    }
}