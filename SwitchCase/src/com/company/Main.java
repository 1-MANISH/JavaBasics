package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter fruit name : ");
        String fruit = input.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Kuch or hi hai");
        }

        int digit = input.nextInt();

        switch (digit) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("Kyaa input kiyaa tumnee");
        }

        int day= input.nextInt();

        switch (day){
            case 1,2,3,4-> System.out.println("Weakday");
            case 5,6-> System.out.println("Weakend");
            default -> System.out.println("Enter valid input");
        }


    }
}
