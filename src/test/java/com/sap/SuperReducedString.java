package com.sap;

import org.junit.Test;

import static java.lang.Math.max;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

//https://www.hackerrank.com/challenges/reduced-string/

public class SuperReducedString {

    static String superReducedString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            String repeat = "" + s.charAt(i) + s.charAt(i + 1);
            if (s.charAt(i) == s.charAt(i + 1) && s.contains(repeat)) {
                s = s.replace(repeat, "");
                i = max(-1, i - 3);
            }
        }
        return s;
    }

    @Test
    public void testA() {
        assertThat(superReducedString("aaabccddd"), is("abd"));
    }

    @Test
    public void testB() {
        assertThat(superReducedString("aa"), is(""));
    }

    @Test
    public void testC() {
        assertThat(superReducedString("baab"), is(""));
    }


    @Test
    public void testD() {
        assertThat(superReducedString("ppffccmmssnnhhbbmmggxxaaooeeqqeennffzzaaeeyyaaggggeessvvssggbbccnnrrjjxxuuzzbbjjrruuaaccaaoommkkkkxx"), is(""));
    }
}

