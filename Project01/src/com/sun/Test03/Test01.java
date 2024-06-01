package com.sun.Test03;

public class Test01 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str = " + str);
        System.out.println(str.hashCode());
        getStr(str);
    }

    public static void getStr(String s) {
        System.out.println(s.hashCode());
        s += "world";
        System.out.println("s = " + s);
        System.out.println(s.hashCode());
    }
}
