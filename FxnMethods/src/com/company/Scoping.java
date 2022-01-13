package com.company;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        update(a,b);
        // block scope
        {
            int c=100;
            System.out.println(c);
        }
        int c=200;
        System.out.println(c);

        // loop scope
        int num=0;
        for(int i=0;i<5;i++){
            num+=i+1;
            int x=1;
        }
    }
    // fxn scope
    static void update(int a,int b){
        // tmp1 & tmp2 can't be accessed outside fxn
        int tmp1=a,tmp2=b;
        tmp1++;
        tmp2++;
    }
}
