package com.company.Lecture5;

import java.util.Scanner;

public class Swap {
    public static Scanner scanner = new Scanner(System.in);

    public static void solve1() {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("%d %d%n", num1, num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.printf("%d %d%n", num1, num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.printf("%d %d%n", num1, num2);

    }
    public static void main(String[] args) {

        solve1();

        scanner.close();
    }
}
