package com.lugowoy.tasks.core.determineTimeForPersonToRetire;

/** Created by Konstantin Lugowoy on 02.10.2017. */

public class Person {

    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person[" +
                "age=" + age +
                ", sex=" + gender +
                ']';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
