package com.sun.Test10;

public class Test03 {
    private static String name;
    private int age;
    private String email;
    public static void show(){
        name="杨玲玲";
        System.out.println("我是展示");
//        age=13;
//        this.email="";
    }
public static void print(){
   Test03 test03=new Test03();
        show();
        test03.age=13;
//        email="";
System.out.println("我是打印");
}
    public static void main(String[] args) {
        Test03 test03=new Test03();
        test03.print();
        show();
        print();
    }
}
