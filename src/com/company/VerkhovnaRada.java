package com.company;

import java.util.ArrayList;
import java.util.List;

public class VerkhovnaRada {

    public List<Fraction> fractions = new ArrayList<>();

    private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();

    public static VerkhovnaRada getVerkhovnaRada() {
        return verkhovnaRada;
    }


    public static void s() {
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction("Fraction#1"));
        fractions.forEach(fraction -> System.out.println(fraction));
    }

    public void deleteFraction(String name) {
        fractions = new ArrayList<Fraction>(fractions.stream().filter(x -> !x.getFraction().equalsIgnoreCase(name)).toList());
    }

    public void outputAllFraction() {
        fractions.forEach(fraction -> {
            System.out.println(fraction);
        });
    }

    public void clear(String name) {
        fractions
                .stream()
                .filter(f -> f.getFraction().equalsIgnoreCase(name))
                .findFirst()
                .get()
                .person.clear();
    }

    public void outputSpecificFraction(String name) {
        Fraction fraction = fractions
                .stream()
                .filter(f -> f.getFraction().equalsIgnoreCase(name))
                .findFirst()
                .get();
        System.out.println(fraction);
    }

}
