package com.company.Lecture5;

import java.util.Scanner;

public class Prime {
    public static Scanner scanner = new Scanner(System.in);

    public static void solve1() {
        int num = scanner.nextInt();

        int numFactors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numFactors++;
            }
        }

        if (numFactors == 2) {
            System.out.printf("%d is a prime number", num);
        } else {
            System.out.printf("%d is NOT a prime number", num);
        }
    }

    public static void solve2() {
//        better than METHOD 1
        int num = scanner.nextInt();

        if (num <= 1) {   // Edge Case
            System.out.printf("%d is NOT a prime number", num);
            return;    // terminates the method
        }

        boolean isPrime = true;  // assume num is prime

        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;   // num is NOT prime
            }
        }

        if (isPrime) {
            System.out.printf("%d is a prime number", num);
        } else {
            System.out.printf("%d is NOT a prime number", num);
        }
    }

    public static void solve4() {
//        better than METHOD 2
        int num = scanner.nextInt();

        if (num <= 1) {   // Edge Case
            System.out.printf("%d is NOT a prime number", num);
            return;    // terminates the method
        }

        boolean isPrime = true;  // assume num is prime

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;   // num is NOT prime
            }
        }

        if (isPrime) {
            System.out.printf("%d is a prime number", num);
        } else {
            System.out.printf("%d is NOT a prime number", num);
        }
    }


    public static void solve5() {
//        better than METHOD 4
        int num = scanner.nextInt();

        if (num <= 1) {   // Edge Case
            System.out.printf("%d is NOT a prime number", num);
            return;    // terminates the method
        }

        boolean isPrime = true;  // assume num is prime

//        for (int i = 2; i <= (int)(Math.sqrt(num)); i++) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;   // num is NOT prime
            }
        }

        if (isPrime) {
            System.out.printf("%d is a prime number", num);
        } else {
            System.out.printf("%d is NOT a prime number", num);
        }
    }


    public static boolean ContainsNoDecimalPart(double n) {
        return ( n == (int)(n) );
//
//        if ( n == (int)(n) ) {
//            return true;
//        } else {
//            return false;
//        }

//        if ( n == (int)(n) ) {
//            return true;
//        }
//        return false;
    }
    public static void solve3() {
        int num = scanner.nextInt();

        if ( num <= 1) {  // Edge Case 1
            System.out.printf("%d is NOT a prime number", num);
            return;
        }

        if (num == 2 || num == 3) {   // Edge Case 2
            System.out.printf("%d is a prime number", num);
            return;
        }

        double n1 = (num-1)/6d;
        double n2 = (num+1)/6d;

        if ( ContainsNoDecimalPart(n1) || ContainsNoDecimalPart(n2) ) {
            System.out.printf("%d is a prime number", num);
        } else {
            System.out.printf("%d is NOT a prime number", num);
        }
    }


    public static void main(String[] args) {
        solve1();

        System.out.println();

        solve2();

        System.out.println();

        solve4();

        System.out.println();

        solve5();

        System.out.println();

        solve3();

        scanner.close();
    }
}
