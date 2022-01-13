package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // print number from 1 to 5
        int n  = input.nextInt();

        System.out.print("Using for loop -> ");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Using While loop -> ");
        int num = 1;
        while(num<=n){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        System.out.print("Using do while loop -> ");
        int x =1;
        do{
            System.out.print(x+" ");
            x++;
        }while(x<=n);
        System.out.println();

        
    }
}
