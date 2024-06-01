package com.sun.test01;

public class Test01 {
    public static void main(String[] args) {
        String val = isEqual(5, 4) ? "两数相同" : "两数不相同";
        System.out.println(val);
        System.out.println(getSum(100));
        print(10);
    }

    public static boolean isEqual(int a, int b) {
//     return a==b?true:false;
        return a == b;
    }

    public static void print(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello");
        }

    }

    public static int getSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
