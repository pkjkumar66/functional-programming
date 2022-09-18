package com.pkj.functional.imperative.function;

public class Main {
    public static void main(String[] args) {
        System.out.println(incrementByOne(10));
        System.out.println(incrementByOneAndMultiply(2,10));
    }

    static Integer incrementByOne(Integer num) {
        return num + 1;
    }

    static Integer incrementByOneAndMultiply(Integer a, Integer b) {
        return (a + 1) * b;
    }
}
