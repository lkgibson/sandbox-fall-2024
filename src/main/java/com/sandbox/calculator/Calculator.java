package com.sandbox.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int... b) {
        int sum = a;
        for (int i : b) {
            sum += i;
        }
        return sum;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}
