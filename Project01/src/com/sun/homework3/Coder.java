package com.sun.homework3;

public class Coder {
    private  String name;
    private String code;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Coder(){}
    Coder(String name,String code,int salary)
    {
        this.code=code;
        this.name=name;
        this.salary=salary;
    }
    public void intro(){
        System.out.println("程序员姓名："+name);
        System.out.println("工号："+code);
    }
    public void showSalary()
    {
        System.out.println("基本工资为"+salary+",奖金无");
    }
    public void work(){
        System.out.println("正在努力写代码");
    }
}
