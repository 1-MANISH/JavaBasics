package com.company;

public class Main {

    public static void main(String[] args) {

        // why need
        //: Q store roll numbers
        int roll_nu = 1;
        // Q: store name
        String name = "Manish";

        // Q: store 2 roll numbers

        //syntax
        /*
            datatype[] var_name = new datatype[size];
            -> all type should be same ir int array conatine integers
        */

        // Q: store five roll numbers
        int[] RollNumbers1 = new int[5];
        // or directly write
        int[] RollNumbers2 ={1,2,3,4,5};

        int[] RollNumbers3;// declaration of array
        // RollNumbers3 getting defined in stack
        RollNumbers3 = new int[5];// Intilization/actually object created in heap memory

        System.out.println(RollNumbers3[0]);

        double[] darr = new double[5];
        System.out.println(darr[0]);

        boolean[] barr = new boolean[5];
        // Initilize with false

        System.out.println(barr[0]);

        String[] sarr = new String[5];
        // Initlize with null
        sarr[4]="Manish";
        System.out.println(sarr[0]);
        System.out.println(sarr[4]);

        char[] carr = new char[5];
        // Intilize with random
        carr[2]='M';
        System.out.println(carr[0]);
        System.out.println(carr[2]);

        String a=null;
        System.out.println(a);
    }
}
