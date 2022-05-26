package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fraction {

    public List<Deputy> person = new ArrayList<>();

    private String fraction;

    public Fraction(String fraction) {
        this.fraction = fraction;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "person=" + person +
                ", fraction='" + fraction + '\'' +
                '}';
    }
}
