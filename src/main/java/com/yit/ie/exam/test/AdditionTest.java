package com.yit.ie.exam.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.yit.ie.exam.Addition;

public class AdditionTest {
    private final Addition addition = new Addition();

    @Test
    public void testAdd() {
        assertEquals(5, addition.add(2, 3));
        assertEquals(-1, addition.add(-3, 2));
        assertEquals(0, addition.add(-5, 5));
    }
}