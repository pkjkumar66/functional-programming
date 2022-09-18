package com.pkj.functional.declarative.predicate;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("isValid Phone Number: " + isPhoneNumberValid.test("9453994875"));
    }

    // predicate: takes one input and returns boolean
    static Predicate<String> isPhoneNumberValid = (phoneNumber) -> {
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(phoneNumber);
        return (m.find() && m.group().equals(phoneNumber));
    };

    // bi-predicate: takes two inputs and returns boolean
    // similarly we can define bi-predicate

}
