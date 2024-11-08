package com.sandbox.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addTwoNumbers() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    void addMultipleNumbers() {
        assertEquals(15, calculator.add(5, 5, 5));
        assertEquals(0, calculator.add(0, 0, 0));
        assertEquals(-15, calculator.add(-5, -5, -5));
    }

    @Test
    void subtract() {
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(-10, calculator.subtract(-5, 5));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    void multiply() {
        assertEquals(25, calculator.multiply(5, 5));
        assertEquals(-25, calculator.multiply(-5, 5));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void divide() {
        assertEquals(1, calculator.divide(5, 5));
        assertEquals(-1, calculator.divide(-5, 5));
        assertEquals(0, calculator.divide(0, 5));
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}