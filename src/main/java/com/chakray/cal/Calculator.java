package com.chakray.cal;

public class Calculator {

    private Operator opt;
    private String[] num;

    public Calculator(String operation, String[] numbers) {
        num = numbers;

        switch (operation) {

        case "+":
            opt = new Adder();
            break;

        case "-":
            opt = new Subtractor();
            break;

        case "*":
            opt = new Multiplier();
            break;

        case "/":
            opt = new Divider();
            break;

        default:
            opt = null;
            break;

        }
    }

    public Double calculate() {
        if (opt != null) {
            return opt.calculate(num);
        } else {
            return null;
        }

    }

}