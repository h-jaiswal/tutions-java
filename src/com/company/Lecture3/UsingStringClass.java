package com.company.Lecture3;


import java.util.Arrays;

public class UsingStringClass {
    public static void solve1() {
        String str = "My name is mimi momo";

        int size = str.length();  // length() method return the number of character in the string
//        str is the calling object for the method length()
        System.out.println(size);



        System.out.println(str.charAt(0));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(str.length() - 1));   // last char,    str.length()-1  is the index of last char


        // return index of first occurrence
        System.out.println(str.indexOf("m"));
        System.out.println(str.indexOf("mi"));
        System.out.println(str.indexOf("mi", 14));


        System.out.println(str.indexOf("mi", str.indexOf("mi") + 1)); // second occurence
        System.out.println(str.indexOf(    "mi", str.indexOf(  "mi", str.indexOf("mi")+1  ) +1)   );


        str.lastIndexOf("mi");
        str.lastIndexOf("mi", 13);




        String s1 = "Harshit";
        String s2 = "Jaiswal";
        String s3 = s1.concat(s2);
        System.out.println( s1 );
        System.out.println( s2 );
        System.out.println( s3 );

    }


    public static void solve2() {
        String str = "My name is mimi momo";

        String s1 = str.substring( 5 );
        System.out.println(s1);

        str.substring(6, 10);

        str.substring(6, str.length() );


        str.substring( str.indexOf("mimi") );   // from first occurrence of "mimi" till end

//        etc.

    }
    public static void solve3() {
        String s1 = "Harshit jaiswal";

        System.out.println( s1.toLowerCase() );     // returns required result

        System.out.println( s1.toUpperCase() );     // returns required result

        System.out.println( s1 );

        s1 = "     Harsh  Jaiswal       ";
        System.out.println(s1);

        s1 = s1.trim();     // trim() return requ. result
        System.out.println(s1);
    }

    public static void solve4() {
        String s1 = "Harshit";
        String s2 = "Harshit";

        String s3 = new String("Harshit");

        String s4 = new String("Harshit");

//        == operator consider  value and mem. location both for comparing
        System.out.println( s1 == s2 );
        System.out.println( s3 == s4 );

        System.out.println( s1 == s3 );

//        equals method consider  value ONLY for comparing

        System.out.println( s1.equals(s2) );
        System.out.println( s3.equals(s4) );

        System.out.println( s1.equals(s3) );


        String str1 = "Aaron";
        String str2 = "Aaesha";

        System.out.println( str1.compareTo(str2) );
        System.out.println( str2.compareTo(str1) );

        str1 = "High";
        str2 = "high";

        System.out.println( str1.equalsIgnoreCase(str2) );
        System.out.println( str2.equalsIgnoreCase(str1) );

        System.out.println( str1.compareToIgnoreCase(str2) );
        System.out.println( str2.compareToIgnoreCase(str1) );
    }
    public static void main(String[] args) {

//        Creating strings using String class aka String objects

//        String, StringBuilder and StringBuffer class are present in the default java.lang package
//        StringTokenizer and StringJoiner are present in java.util package

        String s1 = "Harshit";
        String s2 = "Harshit";

        String s3 = new String("Harshit");

        String s4 = new String("Harshit");

        char[] chArr = {'R', 'a', 'j'};
        String s5 = new String( chArr );

        StringBuilder strBuilderObject = new StringBuilder("Harshit");
        String s6 = new String( strBuilderObject );

        StringBuffer stringBufferObject = new StringBuffer("Harshit");
        String s7 = new String(stringBufferObject);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

//        This method converts a String object to a character array
        char[] chArr2 = s5.toCharArray();
        System.out.println( "\n" + Arrays.toString( chArr2 ) + "\n");

        solve1();
        System.out.println();
        solve2();
        System.out.println();
        solve3();
        System.out.println();
        solve4();
    }
}
