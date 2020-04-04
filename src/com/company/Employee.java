package com.company;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Employee extends Person implements ExtraOperation{

    private String companyName;
    private String position;
    private float salary;

    public Employee(String name, String surname, int age, String pesel, String companyName, String position, float salary) {
        super(name, surname, age, pesel);
        this.companyName = companyName;
        this.position = position;
        this.salary = salary;
    }

    public void readData() {
        super.readData();
        System.out.println("Podaj nazwę firmy: ");
        companyName = input.nextLine();
        System.out.println("Podaj stanowisko: ");
        position = input.nextLine();
        System.out.println("Podaj zarobki: ");
        salary = input.nextFloat();

    }

    @Override
    public void showParameters(String parameter) {
        System.out.println("Ulubiony kolega z pracy to: " + parameter);
    }

    @Override
    public void showExtraData(String parameter, int parameter2) {
        System.out.println("Nazwa departamentu w firme: " + parameter);
        System.out.println("Liczba wykorzystanych dni urlopu: " + parameter2);
    }

}
