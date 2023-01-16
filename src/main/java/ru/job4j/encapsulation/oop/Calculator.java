package ru.job4j.encapsulation.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + this.divide(a) + this.multiply(a);
    }

    public static void main(String[] args) {
        Calculator divide = new Calculator();
        Calculator multiply = new Calculator();
        Calculator sumAllOperation = new Calculator();
        int sums = Calculator.sum(5);
        int minuses = Calculator.minus(10);
        int rsl = divide.divide(15);
        int multi = multiply.multiply(20);
        int sumAll = sumAllOperation.sumAllOperation(50);
        System.out.println(sums);
        System.out.println(minuses);
        System.out.println(rsl);
        System.out.println(multi);
        System.out.println(sumAll);
    }
}
