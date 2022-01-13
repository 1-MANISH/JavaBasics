package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(100);
        fun("Manish patidar");
        sum(34,16);
        sum(34.60,15.40);
        demo(1,2,3);
        demo("manish","Rahul");
//        demo(); error
    }
    static  void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static  void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void  sum(int a,int b){
        System.out.println(a+b);
    }
    static void sum(double x ,double y){
        System.out.println(x+y);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
