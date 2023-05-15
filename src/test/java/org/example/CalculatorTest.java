package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testInmultire() {
        Calculator calc = new Calculator(7);
        calc.inmultire(3);
        assertEquals(21, calc.getresult(), 0.001);
    }

    @Test
    void testAdunare() {
        Calculator calc = new Calculator(10);
        calc.adunare(3);
        assertEquals(13, calc.getresult(), 0.001);
    }

    @Test
    void testNegativ() {
        Calculator calc = new Calculator(7);
        calc.negativ();
        assertEquals(-7, calc.getresult(), 0.001);
    }

    @Test
    void testImpartire() {
        Calculator calc = new Calculator(10.0f);

        calc.impartire(2.0f);

        double result = calc.getresult();

        Assertions.assertEquals(5.0f, result);

        // Test divide by zero
        Assertions.assertThrows(ArithmeticException.class, () -> calc.impartire(0));

    }

    @Test
    void testModulo() {
        Calculator calc = new Calculator(7);
        calc.modulo(3);

        double result=calc.getresult();
       Assertions.assertEquals(1, result);
        Assertions.assertThrows(ArithmeticException.class, () -> calc.modulo(0));
    }

    @Test
    void radical() {
        Calculator calc = new Calculator(4);
        calc.radical();
        assertEquals(2, calc.getresult(), 0.001);
    }

    @Test
    void getresult() {
    }
}