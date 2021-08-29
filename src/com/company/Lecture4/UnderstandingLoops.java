package com.company.Lecture4;

public class UnderstandingLoops {
    public static void main(String[] args) {

        int k = 1;
        while (k <= 10) {
            System.out.println(k);

            k++;
        }


        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        System.out.println();
        int i = 1;
        do {
            System.out.println(i);

            i++;
        } while (i <= 10);


        System.out.println();
        int j = 11;
        do {
            System.out.println(j);

            j++;
        } while (j <= 10);

    }
}
