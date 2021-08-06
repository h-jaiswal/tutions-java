package com.company.Lecture1;

public class OutputFormating1 {

    public static void solve1() {
        String name = "Pankaj Tripathi";

//        %s for simple String and %n for new line

        System.out.printf("Name = %s %n", name);

        String firstName = "Harshit";
        String lastName = "Jaiswal";


        System.out.printf("First Name = %s%nLast Name = %s%n", firstName, lastName);

        System.out.printf("%s%s%s", name, firstName, lastName);

        System.out.printf("%n");

        System.out.printf("%s%s%s", name, firstName, lastName);

        System.out.printf("%n");

        System.out.printf("%s%n%s%n%s", name, firstName, lastName);

    }

    public static void solve2() {

//        width = minimum no of char that must be present in the string being fomatted by the format rule
//        if no. of char. present is < than width = missing chars are replaced by single space chars before the string
        String name = "Pankaj Tripathi";

        String firstName = "Harshit";
        String lastName = "Jaiswal";


        String fName = "Shiv";
        String lName = "Bhosle";


        System.out.printf("'%10s'", fName);

        System.out.printf("%n");

//        we can use - (minus) flag to right justify

        System.out.printf("'%-10s'", fName);


//        when no. of chars in string is more than width, then no need to fill with single spaces

        System.out.printf("%n");
        System.out.printf("%10s", name);

        System.out.printf("%n");
        System.out.printf("%-10s", name);


    }

    public static void solve3() {
//        precision in string formatting = max number of chars. allowed

        String name = "Pankaj Tripathi";

        String firstName = "Harshit";
        String lastName = "Jaiswal";


        String fName = "Shiv";
        String lName = "Bhosle";

        System.out.printf("Name = %.1s. %s", firstName, lastName);
    }

    public static void main(String[] args) {

//        printf is a overloaded method with as seen below ->

//        System.out.printf( format, arguments )      (WE'LL USE THIS FOR NOW)

//        System.out.printf( locale, format, arguments )

        solve1();
        System.out.printf("%n");
        solve2();
        System.out.printf("%n");
        solve3();
    }

}
