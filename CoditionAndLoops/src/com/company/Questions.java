package com.company;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        int a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        int mx=a;
        if(b>mx) mx=b;
        if(c>mx) mx=c;

        //or
        int Max = Math.max(a,b);
        Max = Math.max(Max,c);


        System.out.println("Largest = "+mx);
        System.out.println("Largest = "+Max);

        System.out.println(Math.abs(8-9));
        System.out.println(Math.min(8,9));
        System.out.println(Math.ceil(8.89));
        System.out.println(Math.ceil(8.50));
        System.out.println(Math.ceil(8.30));
        System.out.println(Math.floor(8.89));
        System.out.println(Math.floor(8.50));
        System.out.println(Math.floor(8.30));
        System.out.println(Math.round(8.89));
        System.out.println(Math.round(8.50));
        System.out.println(Math.round(8.30));
        System.out.println(Math.pow(2,4));

        */

        // case check
        /*
        char ch = input.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }else{
            System.out.println("Not a alphabate");
        }

        // how to remove extra spaces
        System.out.println(input.next().trim());
        System.out.println(input.next().trim().charAt(0));
        */

        // fib ser
        // 0 1 1 2 3 5 8 13 21 .....

        /*
        int n = input.nextInt();
        int a=0,b=1;
        for(int i=0;i<=n;i++){
            System.out.println("fib("+i+")"+" -> "+a);
            int temp=a;
            a=b;
            b=a+temp;
        }
        */

        // count digit & reverse
        /*
        int n;
        n=input.nextInt();

        int digit;
        digit = input.nextInt();
        int temp = n;
        int cnt=0;
        while(n>0){
            int d = n%10;
            if(d==digit)cnt++;
            n=n/10;
        }

        System.out.println(temp+" Me "+digit+" comes = "+cnt+" times");
        // revesre of n
        int ans=0;
        while(temp>0){
            int dig = temp%10;
            ans = ans*10+dig;
            temp=temp/10;
        }
        System.out.println("Reverse -> "+ans);
         */

        // calculator

        while(true){
            System.out.print("Enter opration -> ");
            char opr = input.next().trim().charAt(0);
            int a,b;
            System.out.print("Enter first number -> ");
            a=input.nextInt();
            System.out.print("Enter Second number -> ");
            b=input.nextInt();

            if(opr=='+'){
                System.out.println("Addition of "+a+" & "+b+" = "+(a+b));
            }else if(opr=='-'){
                System.out.println("Subtraction of "+a+" & "+b+" = "+(a-b));
            }else if(opr=='*'){
                System.out.println("Multiplication of "+a+" & "+b+" = "+(a*b));
            }else if(opr=='/'){
                System.out.println("Division of "+a+" & "+b+" = "+(a/b));
            }else{
                System.out.println("Try with valid opration +,-,* and /");
            }
            System.out.print("You want to stop then press X or x");
            char stop = input.next().trim().charAt(0);
            if(stop=='x' || stop=='X') break;
        }
    }
}
