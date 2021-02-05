package com.sap;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
//https://www.hackerrank.com/challenges/repeated-string/

public class InfiniteStringTest {


    static long repeatedString(String s, long n) {
        return 0;
    }

    @Test
    public void testA() {
        assertThat(repeatedString("abcac", 10L), Matchers.is(4L));
    }

    @Test
    public void testB() {
        assertThat(repeatedString("aba", 10L), Matchers.is(7L));
    }

    @Test
    public void testC() {
        assertThat(repeatedString("a", 1000000000000L), Matchers.is(1000000000000L));
    }
}
