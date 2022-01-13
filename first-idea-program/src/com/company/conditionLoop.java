package com.company;

import java.util.Scanner;

public class conditionLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary : ");
        float salary;
        salary = input.nextFloat();

        if(salary>=100000){
            System.out.println("You can sustain !");
            if(salary>=200000){
                System.out.println("mazee pad yee");
            }
        }else if(salary>=70000){
            System.out.println("Your at good level");
        }else{
            System.out.println("Jo hai thik hai");
        }

        System.out.println("Enter number -> ");
        int n;
        n=input.nextInt();

        System.out.println("Using while loop - >");
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.println("Using For loop - >");
        for(int count =1;count<=n;count++){
            System.out.print(count+" ");
        }
        System.out.println();

        System.out.println("Using do while loop - >");
        int a=1;
        do{
            System.out.print(a+" ");
            a++;
        }while(a<=n);
        System.out.println();

        char ch = input.next().charAt(0);

        switch (ch){
            case 'M':
                System.out.println("Monday hai");
                break;
            case 'T':
                System.out.println("Tuesday hai");
                break;
            case 'W':
                System.out.println("Wednesday hai");
                break;
            case 'R':
                System.out.println("Thursday hai");
                break;
            case 'F':
                System.out.println("Friday hai");
                break;
            case 'S':
                System.out.println("Saturday hai");
                break;
            default:
                System.out.println("Valid input dalo");
        }
    }
}
