package com.company.Lecture1;

public class Date5Aug {
    public static void main(String[] args) {
        System.out.printf("");
//        souf + enter

        String firstName = "Harshit";
        String lastName = "Jaiswal";

        System.out.printf("Hello %.2s. %s %n", firstName, lastName);

        System.out.printf("Hello %-3.5s. %s", firstName, lastName);

        StringBuilder fname = new StringBuilder("Gunjan");

        String lname = "Pande";

        System.out.printf("%nHello %s %s. %.3s", lname, fname.substring(3), fname);


        System.out.printf("%nHello %s %s", lname, fname.reverse());

    }
}
