package com.sun.homework;

public class Test02 {
    public static boolean doCheck(int iVar) {
        boolean flag;
        if (iVar % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                iVar -= i;
            }
            System.out.println("iVar = " + iVar);
            flag = true;
        } else {
            for (int i = 0; i <= 20; i++) {
                iVar += i;
            }
            System.out.println("iVar = " + iVar);
            flag = false;

        }
        return flag;
    }

    public static void main(String[] args) {
        boolean result1 = doCheck(2);
        System.out.println(result1);
        boolean result2 = doCheck(3);
        System.out.println(result2);
    }
}
