package com.sun.homework2;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(" 是否一致:" +equals(arr ,arr2) );
    }

    public static boolean equals(int[] arr, int[] arr2) {
        if(arr!=null&&arr2!=null)//空指针没有可比性
        {
            if(arr.length!=arr2.length)
            {
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]!=arr2[i])
                    {
                        return false;
                    }
                }
            }
            else {
                return true;
            }
            return true;
        }
        else {
            return false;
        }

    }
}
