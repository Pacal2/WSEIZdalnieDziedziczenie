package com.company;


import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Person {

    protected String name;
    protected String surname;
    protected int age;
    protected String pesel;
    protected Scanner input;

    public Person(String name, String surname, int age, String pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    protected void readData() {
        System.out.println("Podaj imię: ");
        name = input.nextLine();
        System.out.println("Podaj nazwisko: ");
        surname = input.nextLine();
        System.out.println("Podaj wiek: ");
        age = input.nextInt();
        input.nextLine();
        System.out.println("Podaj pesel: ");
        pesel = input.nextLine();
    }

    protected void printBirthDate() {
        int day = Integer.parseInt(pesel.substring(4,6));
        int month;
        int year;
        // Dla urodzonych po 2000 roku
        if (Integer.parseInt(pesel.substring(2,4)) > 12) {
            year = Integer.parseInt(20 + pesel.substring(0,2));
            month = Integer.parseInt(pesel.substring(2,4)) - 20;
        // Dla urodzonych przed 2000 roku
        } else {
            year =  Integer.parseInt(19 + pesel.substring(0,2));
            month = Integer.parseInt(pesel.substring(2,4));
        }
        System.out.println("Data urodzenia: " + day + "." + month + "." + year);
    }

    protected  void printData() {
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko " + surname);
        System.out.println("Wiek: " + age);
        printBirthDate();

    }


}
