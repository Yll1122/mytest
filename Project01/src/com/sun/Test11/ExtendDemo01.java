package com.sun.Test11;
class Employee {
    String name;
    public void work() {
        System.out.println("尽心尽力地工作");
    }
}

class Teacher extends Employee {
    public void printName() {
        System.out.println("name=" + name);
    }
}
public class ExtendDemo01 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "小明";
        t.printName();
        t.work();
    }
}
