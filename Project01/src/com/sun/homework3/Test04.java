package com.sun.homework3;

public class Test04 {
    public static void main(String[] args) {
        int salary[]={15000,3000};
        Manager m=new Manager("James","9527",salary);
        m.intro();
        m.showSalary();
        m.work();
        System.out.println("=================");
        Coder c=new Coder();
        c.setName("Kobe");
        c.setCode("0025");
        c.setSalary(10000);
        c.intro();
        c.showSalary();
        c.work();
    }
}
