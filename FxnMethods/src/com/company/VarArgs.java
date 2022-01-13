package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
        fun(1,2,3,4,5);
        fun2('a','b','c');
        fun3("Manish","Sahil","Raju");
        fun4(true,false,false,true);
        multiple(10,20,1,2,3,4,5);
    }
    // we can pass as much parameter/value of type int to fxn
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    // we pass as much characters of type char to fxn
    static void fun2(char ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun3(String ...p){
        System.out.println(Arrays.toString(p));
    }
    static void fun4(Boolean ...b){
        System.out.println(Arrays.toString(b));
    }
    static void multiple(int a,int b,int ...v){
        System.out.println(a+" "+b+" "+ Arrays.toString(v));
        System.out.println(v[0]+" "+v[1]);
    }

}
