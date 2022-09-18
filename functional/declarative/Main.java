package com.pkj.functional.declarative;

import com.pkj.streams.Gender;
import com.pkj.streams.Person;

import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // find the female list in the people
        people.stream()
                .filter(person -> Gender.FEMALE == person.getGender())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // map: map fxn does transformation
        people.stream()
                .map(person -> person.getGender())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // find the name.size()
        people.stream()
                .map(person -> person.getName())
                .mapToInt(String::length)
                .forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE),
                new Person("Karan joher", 56, Gender.OTHERS)
        );
    }
}
