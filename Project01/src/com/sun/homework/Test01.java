package com.sun.homework;

public class Test01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        doubling(a, b);
        printNum(a, b);
        System.out.println("********************");
        int a1 = doubling(a);
        int b1 = doubling(b);
        printNum(a1, b1);
    }

    public static void printNum(int iVar, int iVar2) {
        System.out.print("iVar:" + iVar + ",");
        System.out.print("iVar2:" + iVar2);
        System.out.println();
    }


    public static void doubling(int r, int p) {
        r = r * 2;
        p = p * 2;
        printNum(r,p);
        System.out.println("翻倍:r="+r+","+"p="+p);
    }

    public static int doubling(int r) {
        return r * 2;
    }
}
