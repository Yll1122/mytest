package com.sun.Test10;

import java.util.Arrays;
//Arrays是对数组进行操作的工具类。
public class Test06 {
    public static void main(String[] args) {
        int[] arr={3,4,5,2,5};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));//把数组转成字符串表现形式。
    }
}
