package com.pkj.functional.imperative.predicate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("isValid Phone Number: " + isPhoneNumberValid("9453994875"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(phoneNumber);
        return (m.find() && m.group().equals(phoneNumber));
    }


}
