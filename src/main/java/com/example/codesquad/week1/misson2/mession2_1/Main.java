package com.example.codesquad.week1.misson2.mession2_1;

public class Main {
    public static void main(String[] args) {
        MyObject1 myObject1 = new MyObject1(10, 2);
        MyCalculator myCalculator = new MyCalculator();
        int a = myObject1.getNum1();
        int b = myObject1.getNum2();

        System.out.println(myCalculator.add(a, b));
        System.out.println(myCalculator.subtract(a, b));
        System.out.println(myCalculator.multiply(a, b));
        System.out.println(myCalculator.divide(a, b));
    }
}
