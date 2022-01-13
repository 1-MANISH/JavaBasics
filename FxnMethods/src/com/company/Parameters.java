package com.company;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first num : ");
        num1=in.nextInt();
        System.out.print("Enter second num : ");
        num2=in.nextInt();
        int ans = Sum(num1,num2);
        System.out.println("The sum  = "+ans);
    }
    // pass by value
    static int Sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
}
