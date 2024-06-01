package com.sun.homework;

public class Test06 {
    public static void main(String[] args) {
        double[] arr= new double[]{10.1,10.4,10.5,10.9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"->"+round(arr[i]));
        }
    }
    public static int round(double num){
       return (int) (num+0.5);//double转换成int小数点后面的数都会被删除
    }
}

