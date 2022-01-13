package com.company;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String ans = name();
        System.out.println("Ig ur name is  "+ans);
    }
    static String name(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ur name : ");
        String nm = in.next();
        return nm;
    }
}
