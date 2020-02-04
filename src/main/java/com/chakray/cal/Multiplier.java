package com.chakray.cal;

public class Multiplier implements Operator {

    @Override
    public double calculate(String[] numbers) {
        double response = Double.valueOf(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            response *= Double.valueOf(numbers[i]);
        }
        return response;
    }

}