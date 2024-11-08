package com.sandbox.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortingUtilityTest {

    @Test
    public void testSelectionSort() {
        Integer[] array = {5, 3, 1, 2, 4};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testInsertionSort() {
        Integer[] array = {5, 3, 1, 2, 4};
        SortingUtility.insertionSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testBubbleSort() {
        Integer[] array = {5, 3, 1, 2, 4};
        SortingUtility.bubbleSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testQuickSort() {
        Integer[] array = {5, 3, 1, 2, 4};
        SortingUtility.quickSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testMergeSort() {
        Integer[] array = {5, 3, 1, 2, 4};
        SortingUtility.mergeSort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    public void testSingleElementArray() {
        Integer[] array = {1};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void testArrayWithDuplicates() {
        Integer[] array = {3, 1, 2, 1, 3};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3}, array);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        Integer[] array = {3, -1, 2, -2, 0};
        SortingUtility.selectionSort(array);
        assertArrayEquals(new Integer[]{-2, -1, 0, 2, 3}, array);
    }
}
```

This test class uses JUnit 5 to test the `SortingUtility` class, covering various sorting methods and corner cases.