package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class stringArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = in.nextInt();
        // arrays of objects
        String[] str = new String[n];

        // taking inputs
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            str[i]=in.next();
        }
        // printing
        for(String ele:str) {
            System.out.print(ele + " | ");
        }
        System.out.println();

        System.out.println(Arrays.toString(str));
    }
}
