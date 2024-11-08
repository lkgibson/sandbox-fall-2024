package com.sandbox.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListStackTest {

    private ArrayListStack<Integer> stack;

    @BeforeEach
    public void setUp() {
        stack = new ArrayListStack<>();
    }

    @Test
    public void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        stack.pop();
        assertEquals(1, stack.peek());
    }

    @Test
    public void testEmpty() {
        assertTrue(stack.empty());
        stack.push(1);
        assertFalse(stack.empty());
        stack.pop();
        assertTrue(stack.empty());
    }

    @Test
    public void testSearch() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(0, stack.search(1));
        assertEquals(1, stack.search(2));
        assertEquals(2, stack.search(3));
        assertEquals(-1, stack.search(4));
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(NoSuchElementException.class, () -> {
            stack.pop();
        });
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(NoSuchElementException.class, () -> {
            stack.peek();
        });
    }
}