package com.pkj.functional.imperative.supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
