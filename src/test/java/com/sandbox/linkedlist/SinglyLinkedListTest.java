package com.sandbox.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinglyLinkedListTest {

    private SinglyLinkedList<String> list;

    @BeforeEach
    public void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    public void testAddFirst() {
        list.addFirst("first");
        assertEquals(1, list.size());
        assertEquals("first", list.peekFirst());
    }

    @Test
    public void testAddLast() {
        list.addLast("last");
        assertEquals(1, list.size());
        assertEquals("last", list.peekLast());
    }

    @Test
    public void testPollFirst() {
        list.addFirst("first");
        list.addFirst("second");
        assertEquals("second", list.pollFirst());
        assertEquals(1, list.size());
        assertEquals("first", list.peekFirst());
    }

    @Test
    public void testPollLast() {
        list.addLast("first");
        list.addLast("second");
        assertEquals("second", list.pollLast());
        assertEquals(1, list.size());
        assertEquals("first", list.peekLast());
    }

    @Test
    public void testPeekFirst() {
        list.addFirst("first");
        assertEquals("first", list.peekFirst());
    }

    @Test
    public void testPeekLast() {
        list.addLast("last");
        assertEquals("last", list.peekLast());
    }

    @Test
    public void testClear() {
        list.addFirst("first");
        list.addLast("last");
        list.clear();
        assertEquals(0, list.size());
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
    }

    @Test
    public void testContains() {
        list.addFirst("first");
        list.addLast("last");
        assertTrue(list.contains("first"));
        assertTrue(list.contains("last"));
        assertFalse(list.contains("middle"));
    }

    @Test
    public void testSize() {
        assertEquals(0, list.size());
        list.addFirst("first");
        assertEquals(1, list.size());
        list.addLast("last");
        assertEquals(2, list.size());
    }

    @Test
    public void testToString() {
        list.addFirst("first");
        list.addLast("last");
        assertEquals("[first, last]", list.toString());
    }

    @Test
    public void testPollFirstEmptyList() {
        assertNull(list.pollFirst());
    }

    @Test
    public void testPollLastEmptyList() {
        assertNull(list.pollLast());
    }

    @Test
    public void testPeekFirstEmptyList() {
        assertNull(list.peekFirst());
    }

    @Test
    public void testPeekLastEmptyList() {
        assertNull(list.peekLast());
    }
}