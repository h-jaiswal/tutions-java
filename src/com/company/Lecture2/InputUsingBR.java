package com.company.Lecture2;

//import java.util.*;
//import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputUsingBR {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt( br.readLine() );

        double d = Double.parseDouble( br.readLine() );

        String s = br.readLine();
    }

}
