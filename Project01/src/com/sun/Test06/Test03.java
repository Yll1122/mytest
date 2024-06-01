package com.sun.Test06;

public class Test03 {
    public static void main(String[] args) {
        String s9="小明83773小花8882小杨";
        String[] split = s9.split("[0-9]+");
        for (String s : split) {
            System.out.println("s = " + s);
        }
    }
}
