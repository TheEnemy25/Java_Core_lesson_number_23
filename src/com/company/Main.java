package com.company;


import java.util.*;
import java.util.stream.Stream;

public class Main {

    static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();
    public static void main(String[] args) {

        Fraction fraction2 = new Fraction("Fraction#2");
        fraction2.person.add(new Deputy("Kondak", "Yuri", 20, true));
        fraction2.person.add(new Deputy("Ivanyan", "Haik", 19, true));
        fraction2.person.add(new Deputy("Kobryn", "Andrian", 23, false));

        Fraction fraction3 = new Fraction("Fraction#3");
        fraction3.person.add(new Deputy("Kondak", "Sofia", 25, true));

        Fraction fraction4 = new Fraction("Fraction#4");
        fraction4.person.add(new Deputy("Kulish", "Bogdan", 22, false));
        fraction4.person.add(new Deputy("Ivahiv", "Nazan", 22, false));

        Fraction fraction5 = new Fraction("Fraction#5");
        fraction5.person.add(new Deputy("Poroshenko", "Petro", 55, false));
        fraction5.person.add(new Deputy("Kobryn", "Kristina", 33, true));

        verkhovnaRada.fractions.add(fraction2);
        verkhovnaRada.fractions.add(fraction3);
        verkhovnaRada.fractions.add(fraction4);
        verkhovnaRada.fractions.add(fraction5);

        Main main = new Main();
        main.menuMain();
    }

    private String read(){
        System.out.println("Введіть фракцію");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        return name;
    }

    public void menuMain() {

        while (true) {
            Menu menu = new Menu();
            menu.menu();

            Scanner scanner = new Scanner(System.in);

            System.out.println();
            switch (scanner.next()) {
                case "1": {
                    verkhovnaRada.s();
                    break;
                }
                case "2":{
                    String name = read();

                    verkhovnaRada.deleteFraction(name);
                    break;
                }
                case "3":{
                    verkhovnaRada.outputAllFraction();
                    break;
                }
                case "4":{
                    String name = read();

                    verkhovnaRada.clear(name);
                    break;
                }
                case "5":{
                    String name = read();

                    verkhovnaRada.outputSpecificFraction(name);

                    break;
                }
            }
        }
    }
}

