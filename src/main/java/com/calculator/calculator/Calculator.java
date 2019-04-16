package com.calculator.calculator;

public class Calculator {
    private double firstValue;
    private double secondValue;
    private double sum;
    private double difference;

    public Calculator(double firstValue, double secondValue)
    {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    public void Adding()
    {
        System.out.println("Sum = " + (sum = firstValue + secondValue));
    }

    public void Substracting()
    {
        System.out.println("Difference = " + (difference = firstValue + secondValue));
    }
}
