package com.chakray.cal;

public class Adder implements Operator {

    @Override
    public double calculate(String[] numbers) {
        double tot = 0;
        for (String s : numbers) {
            tot += Double.valueOf(s);
        }
        return tot;
    }

}