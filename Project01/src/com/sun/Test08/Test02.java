package com.sun.Test08;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner= print();//scannner接受返回的Scanner地址
        int a=scanner.nextInt();//调用方法
        System.out.println(a);
        int j=scanner.nextInt(16);//16进制的12转换为二进制是00010010，转化为十进制是18
        System.out.println(j);
    }
    public static Scanner print(){
        return new Scanner(System.in);//返回一个开辟的Scanner地址。
    }
}
