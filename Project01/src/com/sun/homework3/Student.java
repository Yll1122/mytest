package com.sun.homework3;

public class Student {
    private  String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public  void eat() {
        System.out.println("年龄为" + age + "的" + name + "正在吃饭");
    }

    public void study() {
        System.out.println("年龄为" + age + "的" + name + "正在专心致志的听着");
    }
}
