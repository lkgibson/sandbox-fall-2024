package com.sandbox.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchUtilityTest {

    private SearchUtility searchUtility;

    @BeforeEach
    public void setUp() {
        searchUtility = new SearchUtility();
    }

    @Test
    public void testBinarySearchElementFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        assertEquals(expectedIndex, searchUtility.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchElementNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        assertEquals(expectedIndex, searchUtility.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        int target = 1;
        int expectedIndex = -1;
        assertEquals(expectedIndex, searchUtility.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchSingleElementArrayFound() {
        int[] array = {1};
        int target = 1;
        int expectedIndex = 0;
        assertEquals(expectedIndex, searchUtility.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchSingleElementArrayNotFound() {
        int[] array = {1};
        int target = 2;
        int expectedIndex = -1;
        assertEquals(expectedIndex, searchUtility.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchNegativeNumbers() {
        int[] array = {-5, -4, -3, -2, -1};
        int target = -3;
        int expectedIndex = 2;
        assertEquals(expectedIndex, searchUtility.binarySearch(array, target));
    }

    @Test
    public void testBinarySearchAllSameElements() {
        int[] array = {1, 1, 1, 1, 1};
        int target = 1;
        int expectedIndex = 0; // or any valid index
        assertTrue(searchUtility.binarySearch(array, target) >= 0);
    }

    @Test
    public void testBinarySearchArrayWithDuplicates() {
        int[] array = {1, 2, 2, 2, 3};
        int target = 2;
        int expectedIndex = 1; // or any valid index of 2
        assertTrue(searchUtility.binarySearch(array, target) >= 1 && searchUtility.binarySearch(array, target) <= 3);
    }
}