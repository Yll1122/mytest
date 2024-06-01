package com.sun.homework2;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        int[] orange={1,2,3,4,3,2,1};
        int[] orange1={1,2,3,4,5,2,1};
        System.out.println(Arrays.toString(orange)+"是否对称:"+sym(orange));
        System.out.println(Arrays.toString(orange1)+"是否对称:"+sym(orange1));
    }
    public static boolean sym(int[] arr){
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
            if(arr[i]!=arr[j])
            {
                return false;
            }
        }
        return true;
    }
}
