package com.sandbox.collections;

import java.util.*;

public class CollectionsDemo
{
    public static void main(String[] args)
    {
        Set<String> set = new LinkedHashSet<>(); // maintains order of insertion
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new TreeSet<>(); // sorts elements

        List<String> list = new Vector<>();

        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();

        Queue<String> priorityQueue = new PriorityQueue<>();



        set2.add("Hi");
        set2.add("Howdy");
        set2.add("Hi");
        set2.add("Hello");
        set2.add("Hola");
        set2.add("There");

        System.out.println("set2: " + set2);

        set.add("Hi");
        set.add("Howdy");
        set.add("Hi");
        set.add("Hello");
        set.add("Hola");
        set.add("There");

        System.out.println("set: " + set);

        set.remove("Hi");

        System.out.println("set: " + set);

        set3.add("Hi");
        set3.add("Howdy");
        set3.add("Hi");
        set3.add("Hello");
        set3.add("There");
        set3.add("Hola");

        System.out.println("set3: " + set3);
    }
}
