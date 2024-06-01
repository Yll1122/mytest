package com.sun.Test09;

public class Test04 {
    public static void main(String[] args) {
        String str="小明123小花2833小红982小兰";
        //用正则表达式切割字符串，切割完变成字符串数组。
        String[] split = str.split("[0-9]+");
        for (String s : split) {
            System.out.println("s = " + s);
        }
    }
}
