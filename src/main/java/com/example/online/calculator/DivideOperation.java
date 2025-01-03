package com.example.online.calculator;

public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return (double) (firstNumber / secondNumber);
    }
}
