package com.chakray.cal;

public class Divider implements Operator {

    @Override
    public double calculate(String[] numbers) {

        double result = Double.parseDouble(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            result = result / Double.valueOf(numbers[i]);
        }

        return result;
    }

}