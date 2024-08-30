package com.yit.ie.exam.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.yit.ie.exam.ArraySorter;

public class ArraySorterTest {
    private ArraySorter arraySorter = new ArraySorter();

    @Test
    public void testSort() {
        int[] arr1 = {3, 1, 2};
        int[] expected1 = {1, 2, 3};
        arraySorter.sort(arr1);
        assertArrayEquals(expected1, arr1);

        int[] arr2 = {-1, 0, 1, -2};
        int[] expected2 = {-2, -1, 0, 1};
        arraySorter.sort(arr2);
        assertArrayEquals(expected2, arr2);
    }
}