package com.sun.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        boolean p = isP(next);
        System.out.println("回文数:" + p);
        String next1=scanner.next();
        boolean s=isP(next1);
        System.out.println("回文数:" + s);
    }

    public static boolean isP(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        return (stringBuffer.reverse().toString().equals(str));
        /*用toString把StringBuffer转成String形式进行比较。
         * 比较字符串要用equals比较，用等号比较比较的是地址
         * StringBuffer是类似于String的字符缓冲区，可以通过调用方法进行内容和长度的修改*/

    }
}