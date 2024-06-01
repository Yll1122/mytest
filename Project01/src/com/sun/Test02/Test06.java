package com.sun.Test02;

public class Test06 {
    public static void main(String[] args) {
        int[] arr=getArray();
        System.out.println("arr = " + arr);
        for (int i = 0; i < args.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] getArray() {
        int[] data={1,2,3,4,5};
        System.out.println("data = " + data);
        return data;
    }
}
