package com.company.Lecture4;

import java.util.Scanner;

public class UnderstandingIfElse {
    public static Scanner scanner = new Scanner(System.in);

    public static void solve11() {
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.printf("%d is Even%n", a);
        }
    }

    public static void solve12() {
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.printf("%d is Even%n", a);
        } else {
            System.out.printf("%d is Odd%n", a);
        }
    }

    public static void solve21() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.printf("%d is Greater.%n", a);
        } else {
            System.out.printf("%d is Greater.%n", b);
        }
    }

    public static void solve22() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.printf("%d is Greater.%n", max);
    }

    public static void solve31() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.printf("%d is Largest.%n", a);
            } else {
                System.out.printf("%d is Largest.%n", c);
            }
        } else {
            if (b > c) {
                System.out.printf("%d is Largest.%n", b);
            } else {
                System.out.printf("%d is Largest.%n", c);
            }
        }
    }

    public static void solve311() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.printf("%d is Largest.%n", max);
    }

    public static void solve32() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d is Largest%n", a);
        } else if ( b > a && b > c ) {
            System.out.printf("%d is Largest%n", b);
        } else {
            System.out.printf("%d is Largest%n", c);
        }
    }

    public static void solve33() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

//        if else nesting + ladder/chaining
        if (a > b) {
            if (a > c) {
                System.out.printf("%d is Largest%n", a);
            }
        } else if (b > c) {
            System.out.printf("%d is Largest%n", b);
        } else {
            System.out.printf("%d is Largest%n", c);
        }
    }

    public static void solve34() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

//        nesting in ternary operator
//        this is equivalent to nesting if-else example done previously

        int largest = a>b ? (a > c ? a : c) : (b > c? b :c);

        System.out.printf("%d is Largest", largest);
    }

    public static void solve4() {

        int marks = scanner.nextInt();
        char grade = 'F';

//        if else ladder/chain

        if (marks > 90) {
            grade = 'A';
        } else if (marks > 75) {
            grade = 'B';
        } else if (marks > 65) {
            grade = 'C';
        } else if (marks > 55) {
            grade = 'D';
        } else if (marks > 45) {
            grade = 'E';
        }

        System.out.printf("Marks : %d%nGrade : %c%n", marks, grade);
     }


        public static void main(String[] args) {
        solve11();
        solve12();

        solve21();
        solve22();

        solve31();
        solve311();
        solve32();
        solve33();

        solve4();

        scanner.close();
    }
}
