package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr;
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[][] arr2;
        arr2 = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int ans_sum = sum1dArray(arr,n);
        int ans_sum2 = sum2dArray(arr2,n,n);
        System.out.println("Sum of 1d array = "+ans_sum);
        System.out.println("Sum of 2d array = "+ans_sum2);
    }
    public static int sum1dArray(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }return sum;
    }
    public static int sum2dArray(int[][] arr2,int n,int m) {
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=arr2[i][j];
            }
        }
        return sum;
    }
}
