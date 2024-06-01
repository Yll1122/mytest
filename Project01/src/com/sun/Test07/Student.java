package com.sun.Test07;


public class Student {
    private String name;
    private  int age;
    private int sid;
    public  static int num=0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++num;
    }

    public  void show () {
        System.out.println("name="+name+",age="+age+",sid="+sid);
    }
}
