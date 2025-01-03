package com.example.online.calculator;

public class Calculator {
    // Step 3
    // AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기)
    // 연산 클래스를 만든 후 클래스 간의 관계를 고려하여 Calculator 클래스와 관계를 맺습니다.
    AddOperation addOperation = new AddOperation();
    SubstractOperation substractOperation = new SubstractOperation();
    MultiplyOperation multiplyOperation = new MultiplyOperation();
    DivideOperation divideOperation = new DivideOperation();

    // Step 1 : 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만듭니다.
    public double calculate(String operator, int firstNumber, int secondNumber) {
        return switch (operator) {
            case "+" -> this.addOperation.operate(firstNumber, secondNumber);
            case "-" -> this.substractOperation.operate(firstNumber, secondNumber);
            case "*" -> this.multiplyOperation.operate(firstNumber, secondNumber);
            case "/" -> this.divideOperation.operate(firstNumber, secondNumber);
            case "%" -> (double) (firstNumber % secondNumber);  // Step 2 : 나머지 연산자(%)를 수행할 수 있게 코드 변경
            default -> 0.0;
        };
    }
}