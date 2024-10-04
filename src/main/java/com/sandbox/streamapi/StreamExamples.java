package com.sandbox.streamapi;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

public class StreamExamples
{
    public static void main(String[] args)
    {
        // Stream API is a new feature in Java 8 that allows you to work with collections of objects in a functional way.
        // It allows you to filter, map, reduce, and sort collections of objects.

        //test data

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "stream", "Java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations
        // map

        List<Integer> square = numbers
                .stream()
                .map(x -> x * x) // monad
                .collect(Collectors.toList());
        square.forEach(System.out::println);

        // filter
        List<String> result = names
                .stream()
                .filter(s -> s.toLowerCase().startsWith("s"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        // sorted
        List<String> result2 = names
                .stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        // terminal operations
        // collect
        LinkedHashSet<Integer> squared = numbers // or Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toCollection(LinkedHashSet::new)); // or Collectors.toSet()
        squared.forEach(System.out::println);

        // forEach
        numbers
                .stream()
                .map(x -> x * 2)
                .forEach(System.out::println);
        numbers.forEach(System.out::println);

       /*
       for(Integer i : numbers)
        {
            System.out.println(i);
        }
        same as above numbers.forEach(System.out::println);
        */

        // reduce

        int sum = 0;
        for(int x = 1; x <= 5; x++)
        {
            if (x % 2 == 0)
            {
                sum += x;
            }
        }
        System.out.println("Even sum: " + sum);

        int evenSum = numbers
                .stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (acc, x) -> acc + x); // acc = accumulator
        System.out.println("Even sum: " + evenSum);

        int totalSum = IntStream.iterate(0, x -> x +1)
                .skip(5) // skip 0 1 2 3 4
                .limit(5) // do 5 6 7 8 9
                .filter(evenOnly)
                .reduce(2, Integer::sum); // 6 + 8 = 14, + 2 = 16
        System.out.println("Total sum: " + totalSum);

        // random ints
        Random random = new Random();
        random.ints(1,11) // 1 to 10
                .limit(50)
                .forEach(System.out::println);

        // IntStream generate
        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement) // used in streams & lambdas when you need to modify a variable
                .filter(evenOnly)
                .limit(10)
                .forEach(System.out::println);

        // stream of random strings
        String randomString = Stream.generate(new StringGenerator())
                .limit(16)
                .collect(Collectors.joining());
        System.out.println(randomString);
    }
}
