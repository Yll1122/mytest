package com.sun.Test10;

import java.util.ArrayList;

public class Test02 {
    private String name;
    private int age;
    private int sig;
    private static int sidNumber=0;

    public Test02(String name, int age) {
        this.name = name;
        this.age = age;
        this.sig = ++sidNumber;
    }
public  void print(){//成员方法
    System.out.println("姓名:"+name+"  年龄:"+age+"  学号:"+sig);
}
    public static void main(String[] args) {
        ArrayList<Test02>list=new ArrayList<>();
        Test02 s1=new Test02("张三",22);
        Test02 s2=new Test02("李四",12);
        Test02 s3=new Test02("王五",29);
        s1.print();
        s2.print();
        s3.print();

    }
}
