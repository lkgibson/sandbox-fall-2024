package com.sandbox.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void addFirst() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.peekFirst());
        assertEquals(1, list.peekLast());
    }

    @Test
    void addLast() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, list.peekFirst());
        assertEquals(2, list.peekLast());
    }

    @Test
    void pollFirst() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.pollFirst());
        assertEquals(1, list.pollFirst());
        assertNull(list.pollFirst());
    }

    @Test
    void pollLast() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.pollLast());
        assertEquals(1, list.pollLast());
        assertNull(list.pollLast());
    }

    @Test
    void peekFirst() {
        list.addFirst(1);
        assertEquals(1, list.peekFirst());
        list.addFirst(2);
        assertEquals(2, list.peekFirst());
    }

    @Test
    void peekLast() {
        list.addLast(1);
        assertEquals(1, list.peekLast());
        list.addLast(2);
        assertEquals(2, list.peekLast());
    }

    @Test
    void clear() {
        list.addFirst(1);
        list.addLast(2);
        list.clear();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    void contains() {
        list.addFirst(1);
        list.addLast(2);
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertFalse(list.contains(3));
    }

    @Test
    void size() {
        assertEquals(0, list.size());
        list.addFirst(1);
        assertEquals(1, list.size());
        list.addLast(2);
        assertEquals(2, list.size());
        list.pollFirst();
        assertEquals(1, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void toStringTest() {
        list.addFirst(1);
        list.addLast(2);
        assertEquals("[1, 2]", list.toString());
    }
}