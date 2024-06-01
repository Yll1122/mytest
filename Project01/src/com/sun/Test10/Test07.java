package com.sun.Test10;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        String line = "ysKUreaytWTRHsgFdSAoidq";
        char[] chars = line.toCharArray();//字符串转字符数组
        Arrays.sort(chars);//字符数组排序
        for (int i = chars.length-1; i >=0 ; i--) {
            System.out.print(chars[i]+" ");
        }
        String s = Arrays.toString(chars);
        System.out.println(s);
    }
}
