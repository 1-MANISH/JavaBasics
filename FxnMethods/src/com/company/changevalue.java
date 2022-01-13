package com.company;

public class changevalue {
    public static void main(String[] args) {

        // creating an array

        int[] arr = {1,2,3,4,5};
        System.out.print("Before->");
        print(arr,5);
        change(arr,5);
        System.out.print("After->");
        print(arr,5);

    }
    // pass by ref variable
    static void change(int[] nums,int n){
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*10;
        }
    }
    static  void print(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
