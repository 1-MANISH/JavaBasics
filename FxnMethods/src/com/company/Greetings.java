package com.company;


import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        greet("Manish");
        greet("Rahul");
        greet("Rohit");
    }
    static void greet(String name){
        System.out.println("Hello "+name);
        System.out.println("Welcome to my code base!");
    }
}
