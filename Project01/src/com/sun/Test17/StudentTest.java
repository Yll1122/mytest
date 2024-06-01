package com.sun.Test17;

import com.sun.Test16.Student;

public class StudentTest extends Student {
    public static void main(String[] args) {
        Student student=new Student();//父类对象
        student.pass="snswi2222";
        StudentTest s=new StudentTest();//子类对象
        /*
        子类继承父类，并且new子类对象才可以调用default修饰的变量
        new父类是无法调用default修饰的变量
         */
        s.username="sjs";
        s.pass="sisss";
    }
}
