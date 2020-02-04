package com.chakray;

import org.junit.Test;

import com.chakray.cal.Calculator;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    @Test
    public void testCalculateAddition() {
        System.out.println("\nRunning test for Addition");
        String op = "+";
        String[] array = { "1", "2", "3" };

        Calculator cal = new Calculator(op, array);
        double result = cal.calculate();
        System.out.println("Result: " + result);

        Assert.assertTrue(6 == result);
    }

    @Test
    public void testCalculateSubstraction() {

        System.out.println("\nRunning test for Substraction");
        String op = "-";
        String[] array = { "10", "5", "3" };

        Calculator cal = new Calculator(op, array);

        double result = cal.calculate();
        System.out.println("Result: " + result);

        Assert.assertTrue(2 == result);
    }

    @Test
    public void testCalculateMultiply() {

        System.out.println("\nRunning test for Multiplication");
        String op = "*";
        String[] array = { "1", "2", "3" };

        Calculator cal = new Calculator(op, array);
        double result = cal.calculate();
        System.out.println("Result: " + result);

        Assert.assertTrue(6 == result);
    }

    @Test
    public void testCalculateDivision() {

        System.out.println("\nRunning test for Division");
        String op = "/";
        String[] array = { "10", "2", "2" };

        Calculator cal = new Calculator(op, array);
        double result = cal.calculate();
        System.out.println("Result: " + result);

        Assert.assertTrue(2.5 == result);
    }
}