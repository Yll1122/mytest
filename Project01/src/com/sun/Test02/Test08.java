package com.sun.Test02;

public class Test08 {
    public static void main(String[] args) {
        int[] arr={1,8,6,7,3};
        int num=0;
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
           num =arr[j];
           arr[j]=arr[i];
           arr[i]=num;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+"\t");
        }
    }
}
