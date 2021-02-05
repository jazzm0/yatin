package com.sap;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

//https://www.hackerrank.com/challenges/almost-sorted

public class AlmostSorted {

    static boolean almostSorted(int[] a) {
        return false;
    }

    @Test
    public void testA() {
        assertThat(almostSorted(new int[]{1, 2, 3, 5, 4}), is(true));
    }

    @Test
    public void testB() {
        assertThat(almostSorted(new int[]{1, 5, 4, 3, 2, 6}), is(true));
    }

    @Test
    public void testC() {
        assertThat(almostSorted(new int[]{1, 5, 3, 4, 6, 2}), is(false));
    }

    @Test
    public void testD() {
        assertThat(almostSorted(new int[]{3, 1, 2}), is(false));
    }
}

