package com.sun.Test08;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student s1 = new Student("杨玲玲", 22);
        Student s2 = new Student("杨玲霄", 20);
        Student s3 = new Student("杨玲雪", 18);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);// 存的对象地址
        System.out.println("------------------");
        for (Student student : list) {
            System.out.println(student);
            System.out.println(student.getName()+","+student.getAge());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
