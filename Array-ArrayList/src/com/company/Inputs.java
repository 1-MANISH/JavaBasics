package com.company;

import java.util.*;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n =  in.nextInt();

        int[] arr = new int[n];
        // taking input
        System.out.println("Enter arrays elements : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        // printing
        // for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // for each loop
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        //another methods
        Arrays.stream(arr).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println();
        System.out.println(Arrays.toString(arr));

    }
}
