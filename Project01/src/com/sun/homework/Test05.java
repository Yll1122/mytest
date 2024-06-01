package com.sun.homework;

public class Test05 {
    public static void main(String[] args) {
        printX(10);
    }

    public static void printX(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j||j==row-i-1) {
                    System.out.print("O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
