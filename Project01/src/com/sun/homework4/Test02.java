package com.sun.homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("1.录入信息 0.退出");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    inputStu(list , scanner);
                    break;
                case 0:
                    System.out.println("录入完毕");
            }
            if (i == 0){
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            student.show();
        }
    }

    private static void inputStu(ArrayList<Student> list , Scanner sc) {
        System.out.println("请输入姓名：");
        String name=sc.next();
        System.out.println("请输入年龄");
        int age= sc.nextInt();
        Student student=new Student(name,age);
        list.add(student);
    }
}

class Student{
    private String name;
    private int age;

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

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("学生姓名="+name+",年龄"+age);
    }
}
