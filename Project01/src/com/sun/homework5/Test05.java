package com.sun.homework5;

import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        Random random=new Random();
        double f=random.nextDouble()*100;
        String s1=Double.toString(f);
        String s2= (String) s1.subSequence(0,5);
        System.out.println("随机数为：");
        System.out.println(s1);
        System.out.println("转换为：");
        System.out.println(s2);
    }
}
