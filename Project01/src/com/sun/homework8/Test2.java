package com.sun.homework8;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        // 创建Student 对象
        Student s = new Student("小红","上课");
        Student s2 = new Student("小亮","上课");
        Student s3 = new Student("小明","旷课");
        //  创建 ArrayList
        ArrayList<Student> students = new ArrayList<>();
        students.add(s);
        students.add(s2);
        students.add(s3);

        Teacher t = new Teacher("张老师");

        Course course = new Course("Java", t, students);

        t.rollCall(students);

        course.show();
    }
}

class Course {
private Teacher teacher;
private ArrayList<Student> students;
private String cname;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Course(String cname,Teacher teacher, ArrayList<Student> students) {
        this.teacher = teacher;
        this.students = students;
        this.cname = cname;
    }

    public Course() {
    }
    public void show(){
        Teacher teacher1=new Teacher();
        System.out.println("课程名称:"+cname);
        System.out.println("授课老师:"+teacher.getName());
        for (Student student : students) {
            System.out.println(student.getAttendance()+":"+student.getName());
        }

    }
}

class Teacher {
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }
   public void rollCall(ArrayList<Student> students){
   }
}

class Student {
    private String name;
    private String attendance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public Student(String name, String attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public Student() {
    }
}
