package com.sun.test01;

public class Test02 {
    public static void main(String[] args) {
        System.out.println( getSum(1,2l));
        System.out.println(getSum(1l,3));
    }

    public static long getSum(int j,long i) {
        int sum = 0;
        sum = (int) (j-i);
        return sum;
    }

    public static long getSum(long i, int j) {
        int sum = 0;
        sum = (int) (i + j);
        return sum;
    }
}
