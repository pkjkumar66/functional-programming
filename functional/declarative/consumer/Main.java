package com.pkj.functional.declarative.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        greetCustomer.accept(new Customer("Pankaj", "9453994875"));
        greetCustomerV2.accept(new Customer("Pankaj", "9453994875"), false);
    }

    // consumer: takes one input and returns nothing (like void function))
    static Consumer<Customer> greetCustomer = customer ->
            System.out.println("Hello " + customer.firstName +
                    ", thanks for registering phone number " +
                    customer.MobNumber);

    // bi-consumer: takes two inputs and returns nothing (like void function))
    static BiConsumer<Customer, Boolean> greetCustomerV2 =
            (customer, showNumber) -> System.out.println("Hello " + customer.firstName +
                    ", thanks for registering phone number " +
                    (showNumber ? customer.MobNumber : "**********"));

    static class Customer {
        private final String firstName;
        private final String MobNumber;

        public Customer(String firstName, String MobNumber) {
            this.firstName = firstName;
            this.MobNumber = MobNumber;
        }
    }
}
