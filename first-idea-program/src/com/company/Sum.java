package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter first number = ");
        num1=input.nextInt();
        System.out.print("Enter second number = ");
        num2=input.nextInt();
        int sum=num1+num2;
        System.out.print("Sum of "+num1+" & "+num2+" = "+sum);

    }
}
