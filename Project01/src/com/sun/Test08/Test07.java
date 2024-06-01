package com.sun.Test08;

public class Test07 {
    public static void main(String[] args) {
        int[] arr={5,3,7,2,9};
        int num=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[i]>arr[j]){
                    num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
