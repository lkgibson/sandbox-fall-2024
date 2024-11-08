package com.sandbox.recursion;

public class Factorial {

    private static int count = 0;

    public static void main(String[] args) {

            for(int x = 0; x<= 20; x++) {
                System.out.println("Factorial(" + x + ") = " + factorial(x));
            }
    }

    public static long factorial(int x) {

        if(x == 0) {
            return 1;
        }

        count++;
        System.out.println("Count: " + count);

        return x * factorial(x - 1);
    }

}
