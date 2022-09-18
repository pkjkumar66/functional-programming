package com.pkj.functional.declarative.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl.get());
    }

    static Supplier<String> getDBConnectionUrl = () -> "jdbc://localhost:5432/users";
}
