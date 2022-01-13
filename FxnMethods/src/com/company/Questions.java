package com.company;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = in.nextInt();

        System.out.println((IsPrime(n)==true?"Prime":"Not Prime"));

        // print all 3 digit armstrong number
        System.out.println("3 digit armstrong numbers -> ");
        for(int a=100;a<=999;a++){
            if(print3digitArm(a)){
                System.out.println(a);
            }
        }

    }

    static boolean print3digitArm(int a) {
        int temp=a;
        int digitcubesum = 0;
        while(a>0){
            digitcubesum+=(int)(Math.pow(a%10,3));
            a=a/10;
        }
        return temp==digitcubesum;
    }

    static boolean IsPrime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
