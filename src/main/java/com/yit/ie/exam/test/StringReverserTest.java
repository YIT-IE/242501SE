package com.yit.ie.exam.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.yit.ie.exam.StringReverser;

public class StringReverserTest {
    private StringReverser stringReverser = new StringReverser();

    @Test
    public void testReverse() {
        assertEquals("olleh", stringReverser.reverse("hello"));
        assertEquals("", stringReverser.reverse(""));
        assertEquals("a", stringReverser.reverse("a"));
    }
}