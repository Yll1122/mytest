package com.sun.Test02;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[7];//定义一个int型数组，未赋值，长度为7
        long[] arr1 = {1, 2, 3, 4};//定义一个long型数组，已赋值，长度为4
        System.out.println(arr1[0]);
        System.out.println(arr[0]);
        System.out.println("*******************************");
        int[] a = new int[5];
        long[] a1 = new long[5];
        char[] a2 = new char[5];
        short[] a3 = new short[5];
        float[] a4 = new float[5];
        double[] a5 = new double[5];
        boolean[] a6 = new boolean[5];
        byte[] a7 = new byte[5];
        System.out.println(a[0]);
        System.out.println(a1[0]);
        System.out.println(a2[0]);
        System.out.println(a3[0]);
        System.out.println(a4[0]);
        System.out.println(a5[0]);
        System.out.println(a6[0]);
        System.out.println(a7[0]);
    }
}
