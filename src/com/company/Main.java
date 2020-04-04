package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("************************");
        Student Daniel = new Student("Daniel", "Maliszewski", 15, "04220304375", "Szkoła nr. 01 imienia Turinga", "Informatyka");
        Daniel.printData();
        Daniel.showParameters("Tęcza Grawitacji");
        Daniel.showExtraData("Dobry", 3);

        System.out.println("************************");
        Employee Natalia = new Employee("Natalia", "Olszewska", 31, "88012252946", "Hashlingrz", "Programista", 6520);
        Natalia.printData();
        Natalia.showParameters("Michał Stanowski");
        Natalia.showExtraData("Software Development", 9);

    }
}
