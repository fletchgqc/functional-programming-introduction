package com.gft.fpintroduction.users;

public class User {
    private final int age;
    private final String name;
    private final Sex sex;

    public User(int age, String name, Sex sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public boolean isOver18() {
        return age >= 18;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }
}