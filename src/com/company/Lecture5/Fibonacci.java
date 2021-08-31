package com.company.Lecture5;

public class Fibonacci {
    public static int solve1(int n) {
//        n = next position
//        return type = int = return fibonacci number at nth position

        n = n - 1;

        double root5 = Math.sqrt(5);

        double expre = (1 + root5)/2;
        return (int) Math.round( Math.pow( expre, n )/root5 );
    }

    public static int fibN(int n) {
//        recursive method to find nth term in fibonacci series

        if (n==1 || n==2) {
            return n-1;
        }

        int t = fibN(n-1) + fibN(n-2);
        return t;
    }

//    explicit type conversion ->
//    (int) ( expre/value/variable )
//     (float) ( expre/value/variable )

    public static void fibSeries(int nTerms) {

        int t1 = 0;
        int t2 = 1;

//        System.out.printf("%d -> %d%n", 1, t1);
//        System.out.printf("%d -> %d%n", 2, t2);

        System.out.println(t1);
        System.out.println(t2);

//        remaining nTerms-2 terms
        for (int i = 0; i < nTerms-2; i++) {
            int t = t1 + t2;

//            System.out.printf("%d -> %d%n", i+1+2, t);

            System.out.println(t);
            t1 = t2;
            t2 = t;
        }
    }

    public static void main(String[] args) {
//        n = 1;  t -> 0
//        n = 2;  t -> 1

//        n>2
        System.out.println(solve1(3));
        System.out.println(solve1(4));

        System.out.println(solve1(7));
        System.out.println(solve1(8));

        System.out.println();

        System.out.println(fibN(3));
        System.out.println(fibN(4));

        System.out.println(fibN(7));
        System.out.println(fibN(8));

        System.out.println();

        fibSeries(10);

        System.out.println();

//        10 terms using fibN() recursive
        int nTerms = 10;
        for (int i = 1; i <= nTerms ; i++) {
            System.out.println(fibN(i));
        }
//        fibN(1);
//        fibN(2);
//        fibN(3);
//        fibN(4);
//        fibN(5);
//        fibN(6);
//        fibN(7);
//        fibN(8);
//        fibN(9);
//        fibN(10);

        System.out.println();

        nTerms = 10;
        for (int i = 1; i <= nTerms ; i++) {
            System.out.println(solve1(i));
        }
    }
}
