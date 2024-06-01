package com.sun.Test07;


import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 100; i++) {
            int j=r.nextInt(10)+1;
            float s= r.nextFloat();
            System.out.print(j+"\t");
            System.out.println("-------------------");
            System.out.println(s+"\t");
        }
    }
}
