package com.sun.homework5;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("录入的字符串:" + next);
        String s = reverseStr(next);
        System.out.println("反转的字符串:"+ s);
    }

    public static String reverseStr(String  str){
          char[]arr=str.toCharArray();
          char[] arr1=new char[str.length()];
          int j=0;
        for (int i = arr.length-1; i >=0; i--) {
            arr1[j]=arr[i];
            j++;
        }
        return String.valueOf(arr1);
        //String.valueof和Arrays.toString,把数组转换成字符串后者有中括号和逗点。
    }
}
