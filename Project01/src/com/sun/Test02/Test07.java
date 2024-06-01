package com.sun.Test02;

public class Test07 {
    public static void main(String[] args) {
        int x=10;
        System.out.println(x);
        change(x);
        System.out.println(change(x));
    }

    private static int change(int a) {
        a+=10;
        return a;
    }
}
