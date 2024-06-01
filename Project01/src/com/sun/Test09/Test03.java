package com.sun.Test09;

public class Test03 {
    public static void main(String[] args) {
        String str="yanglinglingabc123yanglingling";
        char[] chars = str.toCharArray();//把字符串转成char字符型数组
        for (char aChar : chars) {
            System.out.print(aChar+",");
        }
        System.out.println();
        byte[] bytes = str.getBytes();//把字符串转成byte字节类型
        System.out.println(bytes);
        for (byte aByte : bytes) {
            System.out.print(aByte+",");
        }
        System.out.println();
        //替换所有的目标字符串
        System.out.println(str.replace("yanglingling", "xiaoming"));
    }
}
