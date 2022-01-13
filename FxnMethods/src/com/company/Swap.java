package com.company;

public class Swap {
    public static void main(String[] args) {
        int a = 10,b = 20;
        System.out.println("Before -> "+a+" "+b);

        //swap two number
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("After -> "+a+" "+b);

        swap2(a,b);
        System.out.println("After -> "+a+" "+b);

        String name = "Manish";
        System.out.println("name before = "+name);
        changeName(name);
        System.out.println("name after = "+name);
    }

    static void changeName(String naam) {
        System.out.println("naam in fxn(Before) "+naam);
        naam = "shanim";
        System.out.println("naam in fxn(After) "+naam);
    }

    // pass by value(only value going to be copy)
    static void swap(int n1,int n2){
        int tmp = n1;
        n1=n2;
        n2=tmp;
    }
    // pass by referenec
    static void swap2(int a,int b){
        int tmp = a;
        a=b;
        b=tmp;
    }
}
