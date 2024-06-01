package com.sun.homework3;

public class Test06 {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.eat();
        t.teach();
        Student stu=new Student("韩同学",18);
        stu.eat();
        stu.study();
    }
}
