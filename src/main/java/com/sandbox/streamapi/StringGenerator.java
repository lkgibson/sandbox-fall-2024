package com.sandbox.streamapi;

import java.util.Random;
import java.util.function.Supplier;

public class StringGenerator implements Supplier<String>
{
    Random random = new Random();
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get()
    {
        return "" + letters[random.nextInt(letters.length)];
    }
}
