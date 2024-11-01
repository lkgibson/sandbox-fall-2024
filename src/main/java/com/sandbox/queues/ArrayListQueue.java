package com.sandbox.queues;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListQueue<T> implements Queue<T>
{
    protected List<T> queue;

    public ArrayListQueue()
    {
        queue = new ArrayList<>();
    }

    @Override
    public boolean offer(T t)
    {
        if(this.queue != null)
        {
            this.queue.add(0, t);
        }
        else
        {
            return false;
        }
        return true;
    }

    @Override
    public T poll()
    {
        T returnValue = null;

        try
        {
           returnValue = this.queue.removeLast();
        }
        catch (NoSuchElementException e)
        {
            returnValue = null;
        }
        return returnValue;
    }

    @Override
    public T peek()
    {
        T returnValue = null;

        try
        {
            returnValue = this.queue.getLast();
        }
        catch (NoSuchElementException e)
        {
            // return null if the queue is empty
        }
        return returnValue;
    }

    @Override
    public boolean isEmpty()
    {
        return this.queue.isEmpty();
    }

    public List<T> queue()
    {
        return this.queue;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("ArrayListQueue{");
        sb.append("queue=").append(queue);
        sb.append('}');
        return sb.toString();
    }
}
