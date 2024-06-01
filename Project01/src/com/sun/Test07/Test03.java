package com.sun.Test07;

import com.sun.homework3.Student;

public class Test03 {
    public static void main(String[] args) {
        int[] arr=new int[3];//构造一个int类型的数组
        Student[] students=new Student[3];//构造一个学生类型的数组
        Student s1=new Student("yll",22);//创建s1对象，调用含参构造方法。
        Student s2=new Student("sjy",21);
        Student s3=new Student("scl",24);
        students[0]=s1;//把创建的对象赋值到学生类型数组
        students[1]=s2;
        students[2]=s3;
        for (Student student : students) {//foreach循环打印输出学生类型数组里的值
            System.out.println(student.getName()+","+student.getAge());
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+","+students[i].getAge());
        }
    }
}
