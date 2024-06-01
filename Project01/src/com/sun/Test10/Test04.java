package com.sun.Test10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Test04 {
    //初始化要用try catch捕获，但是该方法只能在方法内使用
    public static FileOutputStream fileOutputStream;
    public static String str=new String("hello");
    public static ArrayList<String> list=new ArrayList<>();
    //静态代码块的作用就是用来初始化静态变量用的，因为静态代码块优先于各类方法先执行
    static {
        try {
            fileOutputStream=new FileOutputStream("d:/1.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("我是静态方法.......");
    }
public  Test04(){
    System.out.println("我是构造方法.......");
}
    public static void main(String[] args) {
        new Test04();//在堆内存new一个地址，该地址指向构造方法
        System.out.println("我是main方法........");
    }
}
