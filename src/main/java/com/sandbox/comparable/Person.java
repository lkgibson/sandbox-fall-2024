package com.sandbox.comparable;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person { " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                " }";
    }

    @Override
    public int compareTo(Person that) {

        int lastNameComparison = this.lastName.compareTo(that.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        int firstNameComparison = this.firstName.compareTo(that.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        return Integer.compare(this.age, that.age);
    }
}