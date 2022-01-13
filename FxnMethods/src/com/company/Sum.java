package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sum();
        sum();
        int ans = sum2();
        System.out.println("The sum = "+ans);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter num1 : ");
        num1=in.nextInt();
        System.out.print("Enter num2 : ");
        num2=in.nextInt();
        sum=num1+num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter num1 : ");
        num1=in.nextInt();
        System.out.print("Enter num2 : ");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("The sum = "+sum);
    }
    /*
    access modifier static return type name(){

     // body
     return statement;
    }
    */
}
