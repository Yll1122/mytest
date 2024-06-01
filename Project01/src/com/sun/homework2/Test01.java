package com.sun.homework2;

public class Test01 {
    public static void main(String[] args) {
        int[] arr={90,67,21,45,64,13,75,78,32,34};
        System.out.println("您的大乐透号码为:");
        printNum(arr);
        }
    public static void printNum(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
