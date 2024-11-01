package com.sandbox.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListQueueTest
{
    private Queue<Integer> testQueue;

    @BeforeEach
    public void setUp()
    {
        testQueue = new ArrayListQueue<>();
    }

    @Test
    void offer()
    {
        assertTrue(testQueue.offer(1));
        assertTrue(testQueue.offer(2));
        assertEquals(2, ((ArrayListQueue)testQueue).queue.size());
    }

    @Test
    void poll()
    {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.poll());
        assertEquals(1, queue.queue.size());
        assertEquals(2, queue.poll());
        assertTrue(queue.isEmpty());
    }

    @Test
    void peek()
    {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.peek());
    }

    @Test
    void isEmpty()
    {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        assertEquals(true, queue.isEmpty());
        queue.offer(1);
        assertEquals(false, queue.isEmpty());
    }

    @Test
    void pollEmptyQueue()
    {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        assertNull(queue.poll());
    }

    @Test
    void peekEmptyQueue()
    {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        assertNull(queue.peek());
    }

    @Test
    void offerNull()
    {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        queue.offer(null);
        assertEquals(1, queue.queue.size());
    }

    @Test
    void testToString()
    {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        queue.offer(1);
        queue.offer(2);
        assertEquals("ArrayListQueue{queue=[2, 1]}", queue.toString());
    }
}
