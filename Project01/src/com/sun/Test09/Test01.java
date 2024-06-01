package com.sun.Test09;

public class Test01 {
    public static void main(String[] args) {
        String str="hello";
        String str1="HELLO";
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
        //比较两个字符串是否相等，忽略大小写。
        System.out.println(str.equalsIgnoreCase(str1));
    }
}