package com.company;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // automatic take place
        float num = input.nextInt();
        System.out.println("Float number = "+num);


        //type casting
        int num2 = (int)(67.56f);
        System.out.println("Number = "+num2);


        // auto matic type promotion in expression
        int a = 257;
        byte b= (byte) a;// 257%256 = 1
        System.out.println("byte = "+b);

        int number = 'a';
        System.out.println(number);

        System.out.println("नमस्ते");

    }
}
