package com.company;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // conditions
        System.out.print("Enter your salary : ");
        float salary = input.nextFloat();

        if(salary>=10000){
            salary+=1200;
        }

        System.out.println("Your salary now  = "+salary);
    }
}
