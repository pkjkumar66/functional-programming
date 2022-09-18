package com.pkj.functional.imperative.consumer;

public class Main {
    public static void main(String[] args) {
        greetCustomer(new Customer("Pankaj", "9453994875"));
        greetCustomerV2(new Customer("Pankaj", "9453994875"), false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.firstName +
                ", thanks for registering phone number " +
                customer.MobNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showNumber) {
        System.out.println("Hello " + customer.firstName +
                ", thanks for registering phone number " +
                (showNumber ? customer.MobNumber : "**********"));
    }

    static class Customer {
        private final String firstName;
        private final String MobNumber;

        public Customer(String firstName, String MobNumber) {
            this.firstName = firstName;
            this.MobNumber = MobNumber;
        }
    }
}
