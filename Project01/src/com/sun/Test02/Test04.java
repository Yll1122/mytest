package com.sun.Test02;

public class Test04 {
    public static void main(String[] args) {
        int[] arr={5,100,5000,10000,300};
        int max=arr[0];
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
