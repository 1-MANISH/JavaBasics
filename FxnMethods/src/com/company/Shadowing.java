package com.company;

public class Shadowing {
    static int x=10;// global(shadow at line 10)
    public static void main(String[] args) {
        System.out.println("Inside main fxn -> "+x);
        greet();

        // reinitilize x for this block
        int x = 100;
        System.out.println("x of main fxn - > "+x);

        System.out.println("Inside main fxn -> "+x);
        greet();
        System.out.println("Inside main fxn -> "+x);
    }
    static void greet(){
        System.out.println("Inside greet fxn -> "+x);
        x++;
    }
}
