package com.pkj.functional.declarative.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println(incrementByOne.apply(10));
        System.out.println(incrementByOneAndMultiply.apply(2, 10));
    }

    // Function(a): Takes one input and returns one output
    static Function<Integer, Integer> incrementByOne =
            num -> num + 1;

    // BiFunction(a, b): Takes two inputs and returns one output
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (a, b) -> (a + 1) * b;
}
