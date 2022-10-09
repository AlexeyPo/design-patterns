package org.alexey.creational.builder;

import java.util.Set;
import java.util.StringJoiner;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;

    public static class Builder {

        private final Person person;

        public Builder() {
            person = new Person();
        }

        public Builder withName(String name) {
            person.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            person.surname = surname;
            return this;
        }

        public Builder withAge(int age) {
            person.age = age;
            return this;
        }

        public Builder withHeight(int height) {
            person.height = height;
            return this;
        }

        public Builder withWeight(int weight) {
            person.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents) {
            person.parents = parents;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "[", "]")
                .add("name: " + name)
                .add("surname: " + surname)
                .add("age: " + age)
                .add("height: " + height)
                .add("weight: " + weight)
                .add("parents: " + parents)
                .toString();
    }
}
