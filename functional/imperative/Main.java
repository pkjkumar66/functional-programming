package com.pkj.functional.imperative;

import com.pkj.streams.Gender;
import com.pkj.streams.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // find the female list in the people
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE == person.getGender()) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
