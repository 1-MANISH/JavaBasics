package com.company;

// for all neccesery libraries
import java.util.*;
//import java.util.Scanner; //no needs by now as baove

public class DynamicArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // arrayList->vector
        /*Syntax

            ArrayList<data_type>list = new ArrayList<>();

            fxn related->
            list.add(ele);-> add elements
            list.set(index,ele)->replace element
            list.remove(index);-> remove at index

            System.out.println(list);
        */

        ArrayList<Integer> list = new ArrayList<>(5);

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // print
        System.out.println(list);

        // replace
        list.set(2,200);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println("Size of list -> "+size);

        // remove
        list.remove(3);
        System.out.println(list);

        size = list.size();
        System.out.println("Size of list -> "+size);

        // taking input from user
        ArrayList<Integer> arrl = new ArrayList<>();

        int n = in.nextInt();
        for(int i=0;i<n;i++){
            arrl.add(in.nextInt());
        }

        // printing
        System.out.println("Method-1  - >  ");
        for(int ele:arrl){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Method-2  - >  ");
        for(int i=0;i<arrl.size();i++){
            System.out.print(arrl.get(i)+" ");
        }
        System.out.println();
    }
}
