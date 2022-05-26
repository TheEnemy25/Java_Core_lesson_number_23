package com.company;

import java.util.*;


public class Deputy extends Person {
    private String surname;
    private String name;
    private int age;
    private boolean bribe;

    public Deputy(String surname, String name, int age, boolean bribe) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deputy)) return false;
        if (!super.equals(o)) return false;
        Deputy deputy = (Deputy) o;
        return getAge() == deputy.getAge() && isBribe() == deputy.isBribe() && Objects.equals(getSurname(), deputy.getSurname()) && Objects.equals(getName(), deputy.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSurname(), getName(), getAge(), isBribe());
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                '}';
    }
}
