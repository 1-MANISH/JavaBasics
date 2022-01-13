package com.company;

import java.util.Scanner;

public class Quesitions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number(n) : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array -> ");
        for(int i=0;i<n;i++) arr[i]=in.nextInt();
        System.out.println("Actual array->");
        print(arr);
        System.out.println("Reverse array->");
        reverse(arr);
        print(arr);
        System.out.println("Array after swap elements->");
        swap(arr,0,n-1);
        print(arr);
        System.out.println("Max  = "+Max(arr));

    }
    // fxn to print max of array
    static int Max(int[] arr){
        //int mx=arr[0];
        int mx=Integer.MIN_VALUE;
        for(int ele:arr){
            mx=Math.max(ele,mx);
        }
        return mx;
    }
    // fxn reverse an array
    static void reverse(int[] arr){
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }

    // fxn to swap array element
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    // fxn to print array
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
