package com.sun.Test09;

public class Test02 {
    public static void main(String[] args) {
        String str="hswoowdswefdcs";
        //从指定下标开始往后找
        System.out.println(str.indexOf("w", 2));
        //第一次出现的位置
        System.out.println(str.indexOf("o"));
        //int型转为char型是ASCI
        System.out.println(str.indexOf(102));
        //从第10个倒着往回数
        System.out.println(str.lastIndexOf("o", 10));
        //数组长度
        System.out.println(str.length());
        //切割字符串
        System.out.println(str.substring(6, 9));//包头不包尾
    }
}
