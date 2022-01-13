package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFxn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        n=in.nextInt();

        int[] arr = new int[n];

        // taking input
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        // prnt
        System.out.println("Before->");
        System.out.println(Arrays.toString(arr));
        changearray(arr);
        System.out.println("After->");
        System.out.println(Arrays.toString(arr));
    }

    static void changearray(int[] a) {
        for(int i=0;i<a.length;i++){
            a[i]*=10;
        }
    }
}
