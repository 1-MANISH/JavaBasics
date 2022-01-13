package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Output
        System.out.println("Hello World");
        System.out.print("Hii I am ");
        System.out.println("Manish");
        // Input
        Scanner input = new Scanner(System.in);
        // input string without space
        System.out.println(input.next());
        // entire line
        System.out.println(input.nextLine());
        // input integer
        System.out.println(input.nextInt());

    }
}
