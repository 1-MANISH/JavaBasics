package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // q: take input of two number and print sum

        Scanner in = new Scanner(System.in);

        int num1,num2,sum;
        System.out.print("Enter num1 : ");
        num1=in.nextInt();
        System.out.print("Enter num2 : ");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("The sum = "+sum);

    }
}
