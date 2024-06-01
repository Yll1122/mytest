package com.sun.Test02;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
      int min=0;
      int max= arr.length-1;

        for (;;) {
            if (min < max) {
                arr[min] = arr[max]+arr[min];//总和
                arr[max] = arr[min]-arr[max];//总和-最大值=最小值
                arr[min] = arr[min]-arr[max];//总和-最小值=最大值
            } else {
                break;
            }
            min++;
            max--;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }


}
