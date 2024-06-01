package com.sun.homework;

public class Test04 {
    public static void main(String[] args) {
        getValue("大", 5, 6, 7);
    }

    public static void getValue(String str, int n1, int n2, int n3) {
        if (str == "大") {
            System.out.println("最大值为："+getMax(n1, n2, n3));
        } else {
            System.out.println("最小值为："+getMin(n1, n2, n3));
        }
    }

    public static int getMax(int i, int j, int k) {
        return (i > j ? i : j) > k ? (i > j ? i : j) : k;
    }

    public static int getMin(int i, int j, int k) {
        return (i < j ? i : j) < k ? (i < j ? i : j) : k;
    }
}

