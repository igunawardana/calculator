package com.chakray;

import java.util.Arrays;

import com.chakray.cal.Calculator;

public class App {
    public static void main(String[] args) {

        String[] numbers = Arrays.copyOfRange(args, 1, args.length);
        Calculator cal = new Calculator(args[0], numbers);
        System.out.println("Final Result: " + cal.calculate());
    }
}
