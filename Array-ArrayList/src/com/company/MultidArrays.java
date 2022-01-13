package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultidArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,m;
        System.out.println("Enter rows & cols : ");
        n=in.nextInt();
        m=in.nextInt();

        int[][] arr = new int[n][m];
        //or
        int[][] arr1 = new int[n][];

        // row are mandatory but column is not neccesary

        //or
        int[][] arr2 ={
                {1,2,3,4},
                {4,5,6},
                {6,7,8,9}
        };

        // input
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        // output
        System.out.println("Method-1->");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Method-2->");
        for(int[] ele:arr){
            for(int subele:ele){
                System.out.print(subele+" ");
            }
            System.out.println();
        }
        System.out.println("Method-3->");
        for(int[] ele:arr){
            System.out.println(Arrays.toString(ele));
        }
        System.out.println("Method-4->");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // variting column array

        System.out.println("Enter number of rows ->");
        int nrow = in.nextInt();
        int[][] varcol_arr = new int[nrow][];

        for(int i=0;i<varcol_arr.length;i++){
            System.out.println("Enter for "+(i+1)+" row how many col u want ->");
            int ncols = in.nextInt();
            varcol_arr[i]=new int[ncols];
            for(int j=0;j<ncols;j++){
                varcol_arr[i][j]=in.nextInt();
            }
        }
        // output
        System.out.println("Array elements are ->");
        for(int[] ele:varcol_arr){
            System.out.println(Arrays.toString(ele));
        }
    }
}
