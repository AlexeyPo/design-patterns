package org.alexey.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        new BuilderDemo().run();
    }

    private void run() {
        Person person = new Person.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
        System.out.println(person);
    }
}
