package com.chakray.cal;

public class Subtractor implements Operator {

    @Override
    public double calculate(String[] numbers) {
        double tot = Double.valueOf(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            tot -= Double.valueOf(numbers[i]);
        }
        return tot;
    }

}