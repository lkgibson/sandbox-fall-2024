package com.sandbox.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda expressions are a way to provide a concise way to represent a method that can be passed around
        // as an argument to another method. They are similar to anonymous classes, but more concise.
        // They are used to provide a way to pass a method as an argument to another method.
        //  x -> x * 2
        // This is a lambda expression that takes an integer x and returns x * 2
        // anonymous function

        // 4 classes
        // Predicate - takes 1 value returns boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - takes 1 value returns 1 value
        Function<Integer, Integer> function = x ->
        {
            x = x + 5;
            return x * 2;
        };

        // Supplier - takes nothing returns 1 value
        Supplier<String> supplier = () -> "Hello World";

        // Consumer - takes 1 value returns nothing
        Consumer<String> consumer = System.out::println;
        Consumer<String> consumer2 = System.out::println;

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
