package com.company;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Student extends Person implements ExtraOperation{

    private String schoolName;
    private String favoriteSubject;


    public Student(String name, String surname, int age, String pesel, String schoolName, String favoriteSubject) {
        super(name, surname, age, pesel);
        this.schoolName = schoolName;
        this.favoriteSubject = favoriteSubject;
    }

    public void readData() {
        super.readData();
        System.out.println("Podaj nazwę szkoły: ");
        schoolName = input.nextLine();
        System.out.println("Podaj ulubiony przedmiot: ");
        favoriteSubject = input.nextLine();
    }

    public void printData() {
        super.printData();
        System.out.println("Nazwa szkoły: " + schoolName);
        System.out.println("Ulubiony przedmiot: " + favoriteSubject);
    }

    @Override
    public void showParameters(String parameter) {
        System.out.println("Ulubiona książka: " + parameter);
    }

    @Override
    public void showExtraData(String parameter, int parameter2) {
        System.out.println("Ocena z zachowania ucznia: " + parameter);
        System.out.println("Liczba opuszczonych dni przez ucznia: " + parameter2);
    }
}
