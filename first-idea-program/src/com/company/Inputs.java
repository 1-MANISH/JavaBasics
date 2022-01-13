package com.company;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        System.out.print("Enter number : ");
        int num = input.nextInt();
        System.out.println("Your number is = "+num);

        System.out.print("Enter any character: ");
        char ch = input.next().charAt(0);
        System.out.println("Your character is  = "+ch);

        System.out.print("Enter any flaot number :  ");
        float f = input.nextFloat();
        System.out.println("Float number  = "+f);

        System.out.print("Enter any double number :  ");
        double d = input.nextDouble();
        System.out.println("Double number  = "+d);

        System.out.print("Enter any lorge inetger: ");
        long l = input.nextLong();
        System.out.println("Your long integer = "+l);

        System.out.print("Enter booleon number  = ");
        boolean check = input.nextBoolean();
        System.out.println("Yout check = "+check);

        int a = 10;
        int milion = 234_000_000;
        System.out.println("Milion  = "+milion);

         */

        System.out.print("Enter name: ");
        String name = input.next();
        System.out.println("Your name = "+name);

        System.out.print("Enter Full name: ");
        String name2 = input.nextLine();
        System.out.println("Your Full name = "+name2);

    }
}
