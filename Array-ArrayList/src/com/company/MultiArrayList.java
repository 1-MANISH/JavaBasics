package com.company;

import java.util.*;
public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // multi dim arraylist

        ArrayList<ArrayList<Integer>> Marr = new ArrayList<>();

        for(int i=0;i<3;i++){
            Marr.add(new ArrayList<>());
        }
        // add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Marr.get(i).add(in.nextInt());
            }
        }

        for(ArrayList<Integer> ele:Marr){
            for(int subele:ele){
                System.out.print(subele+" ");
            }
            System.out.println();
        }

        //
        System.out.println(Marr);
    }
}
